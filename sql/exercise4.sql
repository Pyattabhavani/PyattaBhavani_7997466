SELECT '--- EXERCISE 4 ---' AS '';
-- 4. Peak Session Hours: Count how many sessions are scheduled between 10 AM to 12 PM for each event[cite: 37, 38].
SELECT event_id, COUNT(*) AS sessions_in_peak_hours
FROM Sessions
WHERE TIME(start_time) >= '10:00:00' AND TIME(end_time) <= '12:00:00'
GROUP BY event_id;