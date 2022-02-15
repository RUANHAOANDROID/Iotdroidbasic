# 简单的Iot设备基础模块
## 基础架构
## 目录结构
```
main
├── AndroidManifest.xml
├── java
│   └── com
│       └── yyx
│           └── iot
│               ├── App.kt
│               ├── data
│               │   ├── db
│               │   ├── model
│               │   │   ├── face
│               │   │   └── idcard
│               │   └── netwok
│               │       ├── http
│               │       │   ├── ServiceCreator.kt
│               │       │   └── api
│               │       │       └── IdeaApi.kt
│               │       └── mqtt
│               ├── service                       
│               │   └── BackgroundService.kt
│               ├── ui
│               │   ├── BaseFragment.kt
│               │   ├── MainActivity.kt
│               │   ├── MainFragment.kt
│               │   ├── MainViewModel.kt
│               │   ├── devices
│               │   │   ├── door
│               │   │   │   └── DoorMainFragment.kt
│               │   │   └── face
│               │   │       └── FaceMainFragment.kt
│               │   └── widget
│               ├── utlis
│               └── viewmodel
│                   └── AppViewModel.kt 
├── res 
└── 
```
