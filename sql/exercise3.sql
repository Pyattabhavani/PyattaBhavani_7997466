SELECT '--- EXERCISE 3 ---' AS '';
-- 3. Inactive Users: Users who have not registered for any events in the last 90 days[cite: 34, 36].
SELECT * FROM Users 
WHERE user_id NOT IN (
    SELECT DISTINCT user_id FROM Registrations 
    WHERE registration_date >= DATE_SUB('2025-07-05', INTERVAL 90 DAY)
);