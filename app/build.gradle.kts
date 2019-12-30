plugins {
    id("com.android.application")
}

repositories {
    maven {
        url = uri(extra["github_repo_url"].toString())
        credentials {
            username = extra["github_username"].toString()
            password = extra["github_token"].toString()
        }
    }
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.2")

    defaultConfig {
        applicationId = "com.jordigarcial.watabou.pixeldungeon"
        minSdkVersion(21)
        targetSdkVersion(29)

        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("com.jordigarcial.watabou:pixel-library:1.03")
}
