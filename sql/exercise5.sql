SELECT '--- EXERCISE 5 ---' AS '';
-- 5. Most Active Cities: Top 5 cities with the highest number of distinct user registrations[cite: 39, 40].
SELECT e.city, COUNT(DISTINCT r.user_id) AS distinct_user_registrations
FROM Registrations r
JOIN Events e ON r.event_id = e.event_id
GROUP BY e.city
ORDER BY distinct_user_registrations DESC
LIMIT 5;