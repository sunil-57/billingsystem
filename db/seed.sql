-- Insert 15 customers
INSERT INTO customer (name, houseNumber, unitsConsumed) VALUES
('Sunil Thapa', 'H123', 150.5),
('Aayush Sharma', 'B56', 230.0),
('Pratik Gurung', 'C78', 90.25),
('Sneha Bista', 'D12', 305.0),
('Rajesh KC', 'E44', 120.0),
('Meena Shrestha', 'F91', 180.0),
('Suman Basnet', 'G34', 0.0),
('Rita Acharya', 'H78', 250.25),
('Niraj Dahal', 'I10', 145.0),
('Kabita Joshi', 'J22', 200.0),
('Ramesh Thapa', 'K99', 310.75),
('Sabina Rai', 'L55', 185.5),
('Dipendra Shah', 'M66', 400.0),
('Asmita Kunwar', 'N01', 0.0),
('Bibek Adhikari', 'O88', 95.5);

-- Insert bills with timestamped billing dates
INSERT INTO bill (customerid, billAmount, billingDate) VALUES
(1, 1500.75, '2025-07-01 08:30:00'),
(2, 2300.00, '2025-07-01 09:00:00'),
(3, 902.50,  '2025-07-01 09:15:00'),
(4, 3050.00, '2025-07-01 10:00:00'),
(5, 1200.00, '2025-07-02 11:30:00'),
(6, 1800.00, '2025-07-03 13:45:00'),
(8, 2502.50, '2025-07-01 14:00:00'),
(8, 2525.00, '2025-08-01 08:15:00'),
(9, 1450.00, '2025-06-15 10:30:00'),
(9, 1475.25, '2025-07-15 12:00:00'),
(10, 2000.00, '2025-07-01 15:00:00'),
(11, 3107.50, '2025-07-01 16:00:00'),
(12, 1855.00, '2025-07-01 17:30:00'),
(13, 4000.00, '2025-07-01 18:45:00'),
(13, 4100.00, '2025-08-01 08:00:00'),
(15, 955.00, '2025-07-01 19:00:00');
