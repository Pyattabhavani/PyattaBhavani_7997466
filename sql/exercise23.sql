SELECT DATE_FORMAT(registration_date, '%Y-%m') AS registration_month, COUNT(*) AS count
FROM Registrations
GROUP BY registration_month
ORDER BY registration_month DESC;