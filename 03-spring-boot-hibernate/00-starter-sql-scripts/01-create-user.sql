-- Drop user first if they exist
IF EXISTS (SELECT * FROM sys.server_principals WHERE name = 'sv')
    DROP LOGIN sv;

-- Now create user with proper privileges
CREATE LOGIN sv WITH PASSWORD = 'svpassword';

-- Grant server-wide privileges to the user
ALTER SERVER ROLE sysadmin ADD MEMBER sv;
