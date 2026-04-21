# Java Demo Project

VS Code Java 开发体验项目

## 项目结构

```
JavaDemo/
├── pom.xml              # Maven 构建配置
├── README.md            # 项目说明
├── .vscode/
│   └── settings.json    # VS Code 项目专属配置
└── src/
    ├── main/java/com/example/
    │   └── HelloWorld.java    # 主程序
    └── test/java/com/example/
        └── HelloWorldTest.java # 单元测试
```

## 快速开始

1. **在 VS Code 中打开项目**
   ```bash
   code "C:\Users\孙永杰\JavaDemo"
   ```

2. **等待 Maven 依赖下载**
   - 首次打开时，VS Code 会自动识别 pom.xml
   - 右下角会显示"正在导入 Maven 项目"，等待完成

3. **运行主程序**
   - 打开 `HelloWorld.java`
   - 点击 `main` 方法上方的 **Run** 按钮（或按 F5）
   - 在终端查看输出

4. **运行单元测试**
   - 打开 `HelloWorldTest.java`
   - 点击测试方法旁边的绿色播放按钮
   - 或使用 Test Explorer（烧杯图标）批量运行

## 体验功能

| 功能 | 操作 |
|------|------|
| 代码补全 | 输入时自动提示，按 Tab 接受 |
| 跳转到定义 | Ctrl + 点击类名/方法名 |
| 查看文档 | 鼠标悬停在类/方法上 |
| 重构重命名 | F2 重命名变量/方法 |
| 自动导入 | 保存时自动整理 import |
| 错误提示 | Error Lens 行内显示编译错误 |
| AI 辅助 | Copilot 自动生成代码建议 |

## 练习建议

1. 在 `HelloWorld.java` 的 `run()` 方法中添加新功能
2. 尝试使用 Copilot：输入注释描述功能，看 AI 如何补全代码
3. 添加新的测试方法，体验 TDD 开发流程
