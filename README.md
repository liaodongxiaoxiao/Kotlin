# Kotlin
Kotlin study demo
# 知识点
## 1. Activity/Fragment/Adapter 中获取view对象
### activity_main.xml
``` xml
<?xml version="1.0" encoding="utf-8"?>
<root view >
...
<TextView
    android:id="@+id/textId"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="@string/str_plus"/>
...
</root view>
```
### Activity/Fragment/Adapter
```Kotlin
// 
import kotlinx.android.synthetic.main.layout_name.*
//method 直接用 
textId.text ="Hello World."
```
