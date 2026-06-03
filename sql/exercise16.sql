SELECT user_id, full_name, email, city, registration_date 
FROM Users
WHERE registration_date >= DATE_SUB('2025-02-05', INTERVAL 30 DAY)
  AND user_id NOT IN (
      SELECT DISTINCT user_id 
      FROM Registrations 
      WHERE user_id IS NOT NULL
  );