# ![Kotlin logo](https://kotlinlang.org/assets/images/favicon.ico) [Kotlin](https://kotlinlang.org/)
Kotlin study demo
- [中文文档](http://kotlindoc.com/)
- [官方文档](https://kotlinlang.org/api/latest/jvm/stdlib/)
- [JetBrains/kotlin-examples](https://github.com/JetBrains/kotlin-examples)
- [antoniolg/Kotlin-for-Android-Developers](https://github.com/antoniolg/Kotlin-for-Android-Developers)
- [Schibsted-Tech-Polska/kotlin-kit](https://github.com/Schibsted-Tech-Polska/kotlin-kit)

# 知识点
## 1. Activity/Fragment/Adapter 中获取view对象
### activity_main.xml
``` xml
<?xml version="1.0" encoding="utf-8"?>
<Rootview >
...
<TextView
    android:id="@+id/textId"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
...
</Rootview>
```
### Activity/Fragment/Adapter
```Kotlin
//kotlinx.android.synthetic.main.layout名称.*
import kotlinx.android.synthetic.main.activity_main.*
// 在 Activity 或 Fragment 中 直接用 id对应的实例
textId.text ="Hello World."
// 在adapter 中 用itemView.id
itemView.textId.text = person.name
```
## 2. [startActivity](https://discuss.kotlinlang.org/t/java-interopt-android-intent/1450)

