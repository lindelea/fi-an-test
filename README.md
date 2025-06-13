# Android ChatGPT Clone

This is a minimal Android project skeleton demonstrating a login screen that communicates with an existing backend.

## Login Logic
The login implementation calls `https://auth.ai.fourmix.co.jp/api/v1/auth/login` with Retrofit. On success, the main activity is displayed. See `LoginActivity.kt` for details.

## Build
This project uses Gradle. The provided `gradlew` script simply delegates to the `gradle` command installed on your system. Run `./gradlew assembleDebug` to build the project.

