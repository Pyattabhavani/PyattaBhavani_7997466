SELECT '--- EXERCISE 12 ---' AS '';
-- 12. Event with Maximum Sessions: List the event(s) with the highest number of sessions[cite: 54, 55].
SELECT e.title, COUNT(s.session_id) AS session_count
FROM Events e
JOIN Sessions s ON e.event_id = s.event_id
GROUP BY e.event_id, e.title
HAVING session_count = (
    SELECT COUNT(session_id) AS max_sessions
    FROM Sessions
    GROUP BY event_id
    ORDER BY max_sessions DESC
    LIMIT 1
);