SELECT '--- EXERCISE 14 ---' AS '';
-- 14. Most Registered Events: List top 3 events based on total number of registrations[cite: 58, 59].
SELECT e.title, COUNT(r.registration_id) AS total_registrations
FROM Registrations r
JOIN Events e ON r.event_id = e.event_id
GROUP BY e.event_id, e.title
ORDER BY total_registrations DESC
LIMIT 3;