SELECT e.title, 
       (SELECT COUNT(*) FROM Registrations r WHERE r.event_id = e.event_id) AS total_registrations,
       AVG(f.rating) AS average_feedback_rating
FROM Events e
LEFT JOIN Feedback f ON e.event_id = f.event_id
WHERE e.status = 'completed'
GROUP BY e.event_id, e.title;