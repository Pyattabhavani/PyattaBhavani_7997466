SELECT '--- EXERCISE 10 ---' AS '';
-- 10. Feedback Gap: Events that had registrations but received no feedback at all[cite: 50, 51].
SELECT DISTINCT e.title 
FROM Registrations r
JOIN Events e ON r.event_id = e.event_id
WHERE e.event_id NOT IN (SELECT DISTINCT event_id FROM Feedback);