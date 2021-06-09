# servlet-jsp

## 環境設置

1. 建立Maven專案
2. 下載額外插件Smart Tomcat (IntelliJ IDEA > Preference > Plugins)
3. pom.xml中添加以下專案相依

```xml
<dependency> 
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
</dependency>
```

4. IntelliJ IDEA > Add Configuration > Templates > Smart Tomcat > Tomcat Server 加入官網載好的檔案位置
5. Deployment Directory 設置要部屬的目錄
6. Context Path 輸入服務路徑(ex./hello)
7. Run! 瀏覽器中輸入 localhost:8080/hello 完成!
