# KonaBess
### 支持列表
* 骁龙8Gen2
* 骁龙8Gen1
* 骁龙888
* 骁龙865
* 骁龙855
* 骁龙780G
* 骁龙778G
* 骁龙765
* 骁龙750
* 骁龙690

### 这是什么？

- 一个无需重新编译内核就能实现GPU频率表&电压表调整的简单软件

### 它是如何工作的？

- 通过拆解Boot / Vendor Boot镜像，反编译并修改dtb（device tree binary）中的相关部分，在重新打包后刷入设备来实现

### 我该如何使用它？

- 详见软件内“帮助”

### 为什么叫这个名字？

- Kona是骁龙865系列的代号
- 这个软件最初是为了背刺牙膏倒吸的888而诞生的
- 后来虽处于人道主义原则支持了888，但是名称并不会因此改变

### 使用它能达到多大的提升？

- 我看到的一个骁龙865的降压案例是在性能保持不变的前提下，GPU去空载功耗从4.2W下降到了3.2W，降幅大概是25%
- 当然，能提升多少取决于你的芯片体质和你对稳定性的要求

### 预编译的二进制文件

- [magiskboot](https://github.com/topjohnwu/Magisk)
- [dtc](https://github.com/xzr467706992/dtc-aosp/tree/standalone)

### 截图
<img src="https://raw.githubusercontent.com/xzr467706992/KonaBess/master/screenshots/ss1.jpg" width="180" height="400" /> <img src="https://raw.githubusercontent.com/xzr467706992/KonaBess/master/screenshots/ss2.jpg" width="180" height="400" /> <img src="https://raw.githubusercontent.com/xzr467706992/KonaBess/master/screenshots/ss3.jpg" width="180" height="400" /> 

### 我自己魔改的部分

我给其他soc移植了部分8gen2的电压档位以及原创了一些档位，以便于更灵活的调整电压，从而更好的适应不同的体质

### 电压档位对应表
<img src="https://raw.githubusercontent.com/AirStewart350/KonaBess/master/screenshots/IMG_20231009_160008.jpg" width="180" height="330" /> <img src="https://raw.githubusercontent.com/AirStewart350/KonaBess/master/screenshots/Screenshot_2023-10-09-15-45-24-58_ae1f93045b87aacac90efbb155289789.jpg" width="180" height="400" />

注：对于骁龙865/870最低电压是370mV，即使你能将konabess档位设置成低于min_svs（48）的电压
