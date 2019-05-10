# 客户端模式+Spring Security OAuth2

# 操作方式

### 1. 获取访问令牌

curl -X POST "<http://localhost:8080/oauth/token>" --user clientdevops:789 -d "grant_type=client_credentials&scope=devops"

响应案例：

```
{
    "access_token": "ba5bec71-5aab-4c3e-87a1-a0c5d074c6bd",
    "token_type": "bearer",
    "expires_in": 43199,
    "scope": "devops"
}


### 2. 调用API

curl -X GET http://localhost:8080/user/userList -H "authorization: Bearer ba5bec71-5aab-4c3e-87a1-a0c5d074c6bd"

案例响应：


[
    {
        "name": "er",
        "age": "18",
        "email": "er@j.com"
    },
    {
        "name": "sha",
        "age": "19",
        "email": "sha@j.com"
    },
    {
        "name": "zi",
        "age": "20",
        "email": "zi@j.com"
    }
]
