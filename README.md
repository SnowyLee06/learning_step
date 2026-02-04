# AI Field Mapper

Java + Web application for connecting to SQL Server via JDBC, parsing new table templates, matching fields against existing warehouse metadata, and generating view SQL.

## Features
- JDBC connection test and metadata extraction (dbo schema)
- Local file cache of metadata
- Template parsing (text-based MVP, extendable to Excel/OCR)
- Vector recall + feature re-rank matching
- Threshold control and nullable handling
- Auto JOIN generation from relation file
- View SQL generation (SQL Server MVP; can extend to MySQL/Oracle/PG)
- Logs for parsing, matching, and SQL outputs (downloadable)
- Training pipeline from existing view SQL (batch)
- Evaluation report (Top1/Top3/Top5 + failure export)

## Run Backend
```bash
cd backend
mvn spring-boot:run
```

Backend runs on http://localhost:8080

## Run Frontend
Open `frontend/index.html` in a browser.

## One-click training & evaluation
1. Load metadata cache
   - POST /api/metadata/load
2. Train pipeline (upload multiple SQL files)
   - POST /api/train/pipeline
3. Evaluate (TopN)
   - POST /api/eval/run
4. Export evaluation report
   - POST /api/eval/run/export
5. Export failure cases
   - POST /api/eval/failures

## Notes
- SQL Server JDBC driver is configured in `backend/pom.xml`.
- Place `sentence.onnx` and `vocab.txt` in `backend/src/main/resources/models/`.
- OCR uses Tess4J; update the Tesseract datapath in OcrService if needed.
