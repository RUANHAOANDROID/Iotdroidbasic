# 简单的Iot设备基础模块
## 基础架构
![8371644905257_ pic](https://user-images.githubusercontent.com/10151414/154002579-8471732a-dae3-4104-a9be-c7f37f97d9b2.jpg)

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
