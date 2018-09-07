<img src="http://i.imgur.com/hXY4lcC.png" height="42px" alt="microG" /> Services Core (GmsCore) [NanoDroid]
=======

This is the [NanoDroid](https://gitlab.com/Nanolx/NanoDroid) fork of:

microG GmsCore is a FLOSS (Free/Libre Open Source Software) framework to allow applications designed for Google Play Services to run on systems, where Play Services is not available.

### Changes

What's different compared to the original microG GmsCore?

* built as priv-app
* added Google Contacts to KNOWN_GOOGLE_PACKAGES
* built with [ThibG's fork of microG DroidGuard Helper](https://github.com/ThibG/android_packages_apps_RemoteDroidGuard)
* fix for [microG issue #560 by ale5000](https://github.com/ale5000-git/android_packages_apps_GmsCore/commits/patch-1)
* temporarily put applications into whitelist when high-priority GCM messages are received, by [ale5000 and ccaapton](https://github.com/ale5000-git/android_packages_apps_GmsCore/commits/master)

### Download

The latest build can be downloaded [here](https://www.nanolx.org/apk/GmsCore.apk)

### Please refer to the [wiki](https://github.com/microg/android_packages_apps_GmsCore) for the original source

License
-------
    Copyright 2014-2016 microG Project Team

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
