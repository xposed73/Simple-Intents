[![platform](https://img.shields.io/badge/platform-android-green.svg )](http://developer.android.com/index.html)
[![JitPack](https://img.shields.io/github/tag/asyl/ArcAnimator.svg?label=jitpack)](https://www.jitpack.io/#xposed73/Simple-Intents)

## Simple Intents

### Installation

#### Add this to settings.gradle
```gradle

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
	
	//Add this line
	maven { url 'https://www.jitpack.io' }
	
    }
}
```

#### Add this to your module (app) level build.gradle
```gradle
dependencies {
    implementation 'com.github.xposed73:Simple-Intents:1.0.0'
 }
```

### Usage
```java
//Browser Intent
SimpleIntents.from(context).openLink("https://google.com/");

//Market Intent
SimpleIntents.from(context).showInMarket("com.yourpackage.name");

//Share Intent
SimpleIntents.from(context).shareText("Text", "Message");

//Phone Intent
SimpleIntents.from(context).showDialNumber("1234567890");

//Email Intent
String[] email = {"email@example.com" , "another@gmail.com"}; // you can add multiple emails
SimpleIntents.from(MainActivity.this).sendEmail(email, "", "");
```

## 💰 Donations

#### You are required for this task! Please consider making a donation if you would want to support the ongoing development of this project, the project's author, or its ongoing upkeep. I really appreciate your donation, and I also enjoy food, coffee, and beer. I'm grateful.

**[Donate via PayPal](https://paypal.me/xainull)**: Thank's for creating this project, here's a tea (or some juice) for you!
