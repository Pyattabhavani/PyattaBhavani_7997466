console.log("Welcome to the Community Portal");

window.onload = () => {
    alert("Page Loaded");
};

class Event {
    constructor(name, date, category, seats) {
        this.name = name;
        this.date = date;
        this.category = category;
        this.seats = seats;
    }

    register() {
        if (this.seats > 0) {
            this.seats--;
            return true;
        }
        return false;
    }
}

let events = [];

async function loadEvents() {
    try {
        const response = await fetch("events.json");
        const data = await response.json();

        events = data.map(
            e => new Event(
                e.name,
                e.date,
                e.category,
                e.seats
            )
        );

        displayEvents(events);
    }
    catch(error) {
        console.log(error);
    }
}

function displayEvents(eventList) {

    const container =
        document.getElementById("eventsContainer");

    container.innerHTML = "";

    eventList.forEach(event => {

        const card =
            document.createElement("div");

        card.className = "card";

        card.innerHTML = `
        <h3>${event.name}</h3>
        <p>${event.category}</p>
        <p>Seats: ${event.seats}</p>
        <button onclick="registerEvent('${event.name}')">
        Register
        </button>
        `;

        container.appendChild(card);
    });
}

function registerEvent(name) {

    const event =
        events.find(e => e.name === name);

    if(event.register()) {
        alert("Registration Successful");
    } else {
        alert("No Seats Available");
    }

    displayEvents(events);
}

document.getElementById("categoryFilter")
.addEventListener("change", function() {

    let value = this.value;

    if(value === "All") {
        displayEvents(events);
    } else {
        let filtered =
            events.filter(
                e => e.category === value
            );

        displayEvents(filtered);
    }
});

loadEvents();