SELECT '--- EXERCISE 7 ---' AS '';
-- 7. Low Feedback Alerts: Users who gave feedback with a rating less than 3, comments, and event names[cite: 43, 44].
SELECT u.full_name, e.title AS event_name, f.rating, f.comments
FROM Feedback f
JOIN Users u ON f.user_id = u.user_id
JOIN Events e ON f.event_id = e.event_id
WHERE f.rating < 3;