# TweetFromX

GUI application that lets the user change the Tweet's device name label by the user's aplication's API keys and access tokens.
**This project was made for educative purposes.**

## Important note about the future of TweetFromX
As of writing this (November 23th 2020), I will no longer be bringing new updates for TweetFromX (PC version). I feel like this software is as good enough.
I have put a halt to the promised features that can be found on the releases page in v1.1. However, if there's either a requested issue or a pull request I will definitely bring those to TweetFromX. I haven't worked 2 months on this program and after returning to it I see a horrible codebase. If you feel like something feels off on the code feel free to do a pull request and I'll review it. This will also affect the Android version too.

## Horrible guide on getting this code running on NetBeans.

I personally recommend you to use NetBeans. If you know what you're doing you can use another IDE.
Also I'm gonna say this cause why not, I used JDK-8u261 to develop this, so if you're using JDK 14, you may want to keep this in mind just in case.

**1.** Create a new **Java application** project in the category **Java with Ant**.

**1.1.** Name it TweetFromX, and **DO NOT** create a main class. If you're that person who forgets stuff very easy, note down the project folder.

**2.** After creating it, download the repository by either doing it via Git, getting the source code from the releases page, or by downloading it via the Code button on the repository page.

**3.** When downloaded, extract the zip file (if downloaded from GitHub) and copy its contents to the project folder. Replace all the files.

**4.** NetBeans will show you an error on twtAPI.java. To fix this, simply right click Libraries, add JAR/Folder, then go to the libs folder and import the Twitter4J jar file. You're good to go now!

**Note:** If NetBeans does not show you an error on twtAPI.java, you didn't extract its contents correctly. Remember, do not extract as a folder if you're extracting the zip file in the project folder.


## FAQ

#### Q: How do I get these "api keys" and "access tokens"?
All I can say is apply on https://developer.twitter.com/en. Do not lie and please be sincere on what you're gonna do, since Twitter is really tough on this to avoid spambots. Also even if this is obvious, DO NOT LEAK YOUR API KEYS NOR YOUR ACCESS TOKEN. Even if you can regenerate it, you shouldn't really leak them.

#### Q: What happened to that 16 minute lockdown that you were gonna implement?
Please refer to the section of "Important note about the future of TweetFromX", which can be found on the top.

#### Q: Why Java?
Most people have Java installed, so I guess this langauge is the perfect fit (and let's not forget this project was made for educative purposes so.. yeah!)

#### Q: Your code, guide, and/or README.md file feels... off
I know it does, and about the code I have halted support on this program. Please refer to Important note about the future of TweetFromX for more information about this and how you can help. 

#### Q: Twitter API v2 is gonna be a thing, and Twitter4J uses v1.1, what will happen?
Yeah, no worries. Twitter is apparently planning to make their own library for some programming languages (like Java) with support for Twitter API v2 so no worries. Either I'll use that (and rewrite the twtAPI.java file) or still use Twitter4J if they update their library to support v2.

#### Q: Android app support since it's on Java? 
Of course! I'm working on one right now and soon I'll link it once I finish it.

## Credits

Credit to Yusuke and the Twitter4J contributors for creating and developing a complicated yet amazing Java library for Twitter API. You all are literally gods, even if it seems so simple to you all.
