SELECT '--- EXERCISE 11 ---' AS '';
-- 11. Daily New User Count: Number of users who registered each day in the last 7 days (relative to mock max date)[cite: 52, 53].
SELECT registration_date, COUNT(*) AS new_user_count
FROM Users
WHERE registration_date >= DATE_SUB('2025-02-05', INTERVAL 7 DAY)
GROUP BY registration_date;