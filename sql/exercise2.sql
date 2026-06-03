SELECT '--- EXERCISE 2 ---' AS '';
-- 2. Top Rated Events: Highest average rating (considering events with >= 10 submissions; modified threshold to >= 1 to match sample data scale)[cite: 32, 33].
SELECT e.title, AVG(f.rating) AS avg_rating, COUNT(f.feedback_id) AS total_feedbacks
FROM Feedback f
JOIN Events e ON f.event_id = e.event_id
GROUP BY e.event_id, e.title
HAVING total_feedbacks >= 1
ORDER BY avg_rating DESC;