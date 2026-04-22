# Copilot 指南 - JavaSE 学习项目

## 项目概览

**JavaSE** 是一个基于 Maven 的 Java SE 学习项目，专注于数据结构（如数组）和基础算法的学习与实践。该项目采用 Java 17，配合 JUnit 5 进行单元测试。

### 关键特征
- **Build Tool**: Maven (pom.xml)
- **Java Version**: 17
- **Testing Framework**: JUnit 5
- **Package Structure**: `com.Array` - 数组相关实现

---

## 项目架构

### 代码组织
```
src/main/java/com/Array/
├── Array1.java          # 基础数组操作示例（读取、遍历、求和）
```

**核心模式**：
- 主要逻辑在 `main()` 方法中实现
- 使用 `Scanner` 进行控制台输入
- 直接在主方法中演示完整功能流程

### 测试结构
```
src/test/java/com/
├── [Test classes to be added]
```

---

## 开发工作流

### 构建与编译
```bash
# 编译项目
mvn compile

# 清理构建产物
mvn clean

# 完整构建（编译+测试）
mvn build
```

### 运行程序
```bash
# 方式 1: 在 VS Code 中点击 main 方法上的 Run 按钮
# 方式 2: 使用 Maven 直接执行
mvn exec:java -Dexec.mainClass="com.Array.Array1"
```

### 测试
```bash
# 运行所有测试
mvn test

# 运行特定测试类
mvn test -Dtest=Array1Test
```

---

## 代码约定与模式

### 命名规范
- **包名**: 小写，按功能分类（如 `com.Array` 用于数组相关）
- **类名**: PascalCase，根据功能命名（`Array1.java` = 数组操作示例 1）
- **方法名**: camelCase

### 常见模式

#### 1. 控制台交互式程序
```java
Scanner sc = new Scanner(System.in);
// ... 处理输入
sc.close();  // 必须关闭资源
```
- 所有与用户交互的程序必须显式关闭 `Scanner`，避免资源泄漏

#### 2. 数组操作模板
```java
int[] arr = new int[size];  // 声明
// 初始化/遍历/计算
```

### 最佳实践
- **资源管理**: 使用 try-with-resources 或显式 close()
- **输出格式**: 使用 `System.out.println()` 清晰标识输出
- **算法演示**: 在 main 方法中按步骤注释说明逻辑

---

## 依赖与集成

### Maven 依赖
- **JUnit Jupiter 5.10.0**: 单元测试框架（test scope）

### 编译配置
- **Source/Target**: Java 17
- **Encoding**: UTF-8

---

## AI 代理的建议任务

### 新增功能时
1. 在 `src/main/java/com/Array/` 下创建新类
2. 按 `ArrayN.java` 命名（N 为序列号）
3. 包含 main 方法和详细的注释说明
4. 在 `src/test/java/com/` 下添加对应的 `ArrayNTest.java`

### 代码审查重点
- 确保 Scanner/其他资源已显式关闭
- 验证 main 方法存在且可独立运行
- 确认输出格式清晰易读

---

## 常见问题排查

| 问题 | 原因 | 解决方案 |
|------|------|---------|
| "找不到符号" | 缺少 import 或包路径错误 | 检查 package 声明和 import 语句 |
| Maven 依赖未下载 | 首次打开项目 | 运行 `mvn clean compile` 触发下载 |
| 程序卡住 | Scanner 未关闭或等待输入 | 检查 sc.close() 或提供输入 |

---

## 参考文件
- `pom.xml` - 完整的构建配置
- `README.md` - 项目概览与快速开始
- `src/main/java/com/Array/Array1.java` - 基础示例参考
