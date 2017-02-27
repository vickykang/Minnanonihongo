# Minnanonihongo's App 数据格式

## User

### User

#### 数据格式

key | format | description
----|--------|------------
id | Long | 唯一标识符
phone | String | 电话号码
password | String | 用户密码
name | String | 用户名

## Content

### Book

#### 数据格式

key | format | description
----|--------|------------
id | Long | 唯一标识符
name | String | 书名
lessons | List&lt;Lesson> | 课程列表

### Lession

#### 数据格式

key | format | description
----|--------|------------
id | Long | 唯一标识符
book_id | Long | 所属书本的id
index | Integer | 课程索引
name | String | 课程名称
words | List&lt;Word> | 单词列表
grammars | List&lt;Grammar> | 语法列表

### Word

#### 数据格式

key | format | description
----|--------|------------
id | Long | 唯一标识符
lession_id | Long | 所属课程的id
word | String | 单词，可包含汉字、平假名、片假名等
hiragana | String | 平假名，为汉字注音，可为空
tone | Integer | 声调(0,1,2...)，可为空
meaning | String | 单词含义
transformations | List&lt;Transformation> | 变形列表


### Transformation

#### 数据格式

key | format | description
----|--------|------------
id | Long | 唯一标识符
word_id | Long | 所属单词的id
type | String | 变形类型
result | String | 变形结果
example | String | 例句

### Grammar

#### 数据格式

key | format | description
----|--------|------------
id | Long | 唯一标识符
lession_id | Long | 所属课程的id
content | String | 语法内容
examples | List<String> | 例句列表

### Note

#### 数据格式

key | format | description
----|--------|------------
id | Long | 唯一标识符
user_id | Long | 用户id
belonged_id | Long | 所属id
content | String | 内容

#### 请求参数


key | format | description
----|--------|------------
user_id | Long | 用户id
belonged_id | Long | 所属id
type | Integer | 所属类型，取值范围[0,1]，其中0-Word，1-Grammar
