SELECT '--- EXERCISE 13 ---' AS '';
-- 13. Average Rating per City: Calculate the average feedback rating of events conducted in each city[cite: 56, 57].
SELECT e.city, AVG(f.rating) AS average_rating
FROM Feedback f
JOIN Events e ON f.event_id = e.event_id
GROUP BY e.city;