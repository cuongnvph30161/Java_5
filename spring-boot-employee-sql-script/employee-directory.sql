-- Tạo Database Nếu Chưa Tồn Tại
IF NOT EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = 'employee_directory')
    CREATE DATABASE employee_directory;
GO

-- Sử Dụng Database Vừa Tạo
USE employee_directory;
GO

-- Tạo Bảng employee
IF OBJECT_ID('employee', 'U') IS NULL
BEGIN
    CREATE TABLE employee (
        id INT NOT NULL IDENTITY(1,1),
        first_name VARCHAR(45) NULL,
        last_name VARCHAR(45) NULL,
        email VARCHAR(45) NULL,
        PRIMARY KEY (id)
    );
END
GO

-- Dữ Liệu Mẫu cho Bảng employee
INSERT INTO employee VALUES 
    ('Leslie', 'Andrews', 'leslie@luv2code.com'),
    ('Emma', 'Baumgarten', 'emma@luv2code.com'),
    ('Avani', 'Gupta', 'avani@luv2code.com'),
    ('Yuri', 'Petrov', 'yuri@luv2code.com'),
    ('Juan', 'Vega', 'juan@luv2code.com');
GO
