# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a full-stack social media application (Facebook-like friend finder) with:
- **Backend**: Java 21 with Spring Boot 4.0.0-SNAPSHOT
- **Frontend**: Angular 10.2.0 with TypeScript
- **Database**: SQL Server on localhost:1433 (database: friend-finder, user: sa, password: sa@123#321)

## Development Commands

### Backend (Spring Boot)
```bash
# Start development server (runs on port 5050)
./mvnw spring-boot:run

# Build the application
./mvnw clean package

# Run tests
./mvnw test
```

### Frontend (Angular)
```bash
# Start development server (runs on port 4200)
npm start

# Build for production
ng build --prod

# Run tests
npm test

# Run linting
npm run lint

# Run e2e tests
npm run e2e
```

## Architecture

The application follows a traditional client-server architecture:

```
friend-finder/
├── friend_finder_backend/     # Spring Boot REST API
│   └── src/main/java/com/example/friend_finder/
└── frontend/                  # Angular SPA
    └── src/app/componants/    # Note: typo in "components"
        ├── header/
        ├── login/
        ├── sign-up/
        ├── userhome/          # User dashboard
        └── time-lines/        # User profiles/timelines
```

### Key Architectural Points

1. **Backend Structure**: Currently only contains the main application class. When implementing features:
   - Create controllers in a `controller` package
   - Create services in a `service` package
   - Create entities in an `entity` package
   - Create repositories in a `repository` package

2. **Frontend Routing**: Configured in `app.module.ts` with routes for:
   - `/signup` - User registration
   - `/login` - Authentication
   - `/main` - User home/dashboard
   - `/timeline/:id` - User profiles

3. **Authentication**: Spring Security is included but needs configuration. The frontend has login/signup components ready.

4. **Database**: Hibernate is configured with auto-update DDL. Entities will be automatically synchronized with the database schema.

## Important Notes

- The frontend components directory is misspelled as "componants" instead of "components"
- Bootstrap 3.3.7 is used for styling (consider upgrading for security)
- jQuery is included in assets (consider removing if not needed with Angular)
- The project is in early development - backend implementation is needed