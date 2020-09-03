<h2 style="margin-bottom: 0;" align="center">Easy News - MVVM</h2>

<p align="center">
<img src="https://user-images.githubusercontent.com/15268903/92086924-a97fa100-edec-11ea-8eda-ecb832bf9916.png" height="100" width="100">
<h3 style="margin-top: 0;" align="center">Basic News app using MVVM</h3>
</p>
	
## App Screenshots
<table>
  <tr>
     <td align="center">Top News & Save</td>
     <td align="center">Swipe Delete & Undo</td>
     <td align="center">Search & Pagination</td>
  </tr>
  <tr>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/92087839-d8e2dd80-eded-11ea-9bba-670b85ce594d.gif" height="400" width="200"></td>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/92087855-dda79180-eded-11ea-8289-09cbfcacf589.gif" height="400" width="200"></td>
    <td valign="top"><img src="https://user-images.githubusercontent.com/15268903/92087863-ded8be80-eded-11ea-8989-2ed656b3dd51.gif" height="400" width="200"></td>
  </tr>
 </table>
 <br>


## Features

* Pagination
* Search
* Save with Room
* Swipe to delete
* Undo - restore deleted todo

### Built With

* Android Studio 4.0.1 The latest version can be downloaded from [here](https://developer.android.com/studio/)
* Build gradle 4.0.1
* Android SDK 30
* Kotlin Version 1.4.0

## Libraries Used
* [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started)
* [Room](https://developer.android.com/topic/libraries/architecture/room)
* [Retrofit](https://square.github.io/retrofit/)

### Install the apk

<a href="https://shakilahmedshaj.com/apks/EasyNews.apk"><img alt="Get it on Google Play" src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" width="185" height="70"/></a>

Go to the following [link](https://shakilahmedshaj.com/apks/EasyNews.apk) to download the app.

### Directory Structure

The following is a high level overview of relevant files and folders.

```
Easy News
└───app
    └───src
        └───main
            └───java
                └───com
                    └───decimalab
                        └───easynews
                            │   NewsApplication.kt
                            │
                            ├───adapters
                            │       NewsAdapter.kt
                            │
                            ├───api
                            │       NewsAPI.kt
                            │       RetrofitInstance.kt
                            │
                            ├───db
                            │       ArticleDao.kt
                            │       ArticleDatabase.kt
                            │       Converters.kt
                            │
                            ├───models
                            │       Article.kt
                            │       NewsResponse.kt
                            │       Source.kt
                            │
                            ├───repository
                            │       NewsRepository.kt
                            │
                            ├───ui
                            │   │   NewsActivity.kt
                            │   │   NewsViewModel.kt
                            │   │   NewsViewModelProviderFactory.kt
                            │   │
                            │   └───fragments
                            │           ArticleFragment.kt
                            │           BreakingNewsFragment.kt
                            │           SavedNewsFragment.kt
                            │           SearchNewsFragment.kt
                            │
                            └───util
                                    Constants.kt
                                    Resource.kt
```

## License
```
MIT License

Copyright (c) 2020 Easy News

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
