# 简单的Iot设备基础模块

## 基础架构
基础模块中涵盖了
- MQTT broker 架设在服务器上提供端到端的处理转发
- Web service 提供了MQTT以外的服务
- DataModel 该层提供基本的数据模型封装
- ViewModel 该层隔离了数据模型和视图,使用Livedata作为，使不同形式的页面在功能和数据上可以复用
- View 该层为视图层提供可视和交互
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
## 客户端技术选型
- ViewModel MVVM 核心组件,使得从界面控制器逻辑中分离出视图数据所有权的操作更容易且更高效。
- LiveData MVVM 核心数据组件,与常规的可观察类不同具有生命周期感知能力可以有效避免泄漏问题
- Retrofit  HTTP API 交互主流框架
- Gson   json 序列化
- MQTT 物联网主流通信方案
- Utilcodex 强大好用且轻量的开源Android工具集

