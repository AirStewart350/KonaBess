# KonaBess

[中文版](https://github.com/AirStewart350/KonaBess/blob/master/README_zh-CN.md)
### Support list
* Snapdragon 8Gen2
* Snapdragon 8Gen1
* Snapdragon 888
* Snapdragon 865
* Snapdragon 855
* Snapdragon 780G
* Snapdragon 778G
* Snapdragon 765
* Snapdragon 750
* Snapdragon 690

### What is this?

- A simple app that can custom GPU frequency and voltage tables without recompiling the kernel

### How it works?

- By unpacking Boot / Vendor Boot image, decompiling and editing relevant dtb (device tree binary) files, and finally repacking and flashing.

### How to use?

- See "help" inside.

### Why "KonaBess"?

- "Kona" is the code name of Snapdragon 865 series.
- Snapdragon 888 's GPU has minus improvement in energy efficiency, thus we are able to overclock sd865 and beat it. And this is the reason why the app was born.
- Though sd888 is compatible now, the app name won't change.

### How much improvement can I get?

- I see someone undervolted his sd865, reducing power cost 25% in gfx(4.2w->3.2w) bench.
- In fact, it is chip-specific and depends on your stability requirements.

### Prebuilt binaries

- [magiskboot](https://github.com/topjohnwu/Magisk)
- [dtc](https://github.com/xzr467706992/dtc-aosp/tree/standalone)

### Screenshots
<img src="https://raw.githubusercontent.com/xzr467706992/KonaBess/master/screenshots/ss1.jpg" width="180" height="400" /> <img src="https://raw.githubusercontent.com/xzr467706992/KonaBess/master/screenshots/ss2.jpg" width="180" height="400" /> <img src="https://raw.githubusercontent.com/xzr467706992/KonaBess/master/screenshots/ss3.jpg" width="180" height="400" /> 

### My modifications

I transplanted some Snapdragon 8gen2 voltage levels for sm8250 and the other chips to adjust the voltage better

### Konabess voltage levels and real voltage
<img src="https://raw.githubusercontent.com/AirStewart350/KonaBess/master/screenshots/IMG_20231009_174333.jpg" width="180" height="360" /> <img src="https://raw.githubusercontent.com/AirStewart350/KonaBess/master/screenshots/Screenshot_2023-10-09-15-45-24-58_ae1f93045b87aacac90efbb155289789.jpg" width="180" height="400" />

note:the minimum voltage for sm8250 is 370mV, although you can select the retention konabess level, the real voltage is same as Min_svs(48)
