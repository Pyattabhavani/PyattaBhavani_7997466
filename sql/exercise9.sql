SELECT '--- EXERCISE 9 ---' AS '';
-- 9. Organizer Event Summary: Number of events created by each organizer grouped by their status[cite: 47, 48, 49].
SELECT u.full_name AS organizer_name, e.status, COUNT(e.event_id) AS event_count
FROM Events e
JOIN Users u ON e.organizer_id = u.user_id
GROUP BY e.organizer_id, u.full_name, e.status;