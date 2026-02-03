# AI Field Mapper

Java + Web application for connecting to SQL Server via JDBC, parsing new table templates, matching fields against existing warehouse metadata, and generating view SQL.

## Features
- JDBC connection test and metadata extraction (dbo schema)
- Local file cache of metadata
- Template parsing (text-based MVP, extendable to Excel/OCR)
- Weighted field matching (name 0.3 / description 0.5 / type 0.2)
- Threshold control and nullable handling
- View SQL generation for SQL Server (MVP) with extension points for MySQL/Oracle/PG
- Logs for parsing, matching, and SQL outputs

## Project Structure
- backend/: Spring Boot API
- frontend/: Minimal static UI (HTML/JS) for local use

## Run Backend
```bash
cd backend
mvn spring-boot:run
```

Backend runs on http://localhost:8080

## Run Frontend
Open `frontend/index.html` in a browser.

## Notes
- SQL Server JDBC driver is required (configured in `backend/pom.xml`).
- Extend the parser to support Excel/OCR as needed.
