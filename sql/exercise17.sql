SELECT '--- EXERCISE 17 ---' AS '';
-- 17. Multi-Session Speakers: Speakers handling more than one session across all events[cite: 64, 65].
SELECT speaker_name, COUNT(*) AS session_count
FROM Sessions
GROUP BY speaker_name
HAVING session_count > 1;