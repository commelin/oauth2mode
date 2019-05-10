# 简化模式+Spring Security OAuth2

# 操作方式

### 1. 获取访问令牌

浏览器请求：

http://localhost:8080/oauth/authorize?client_id=clinetmode&redirect_uri=http://localhost:9001/goback&response_type=token&scope=read_userinfo&state=abc

响应案例：

<http://localhost:9001/callback#access_token=0406040a-779e-4b5e-adf1-bf2f02031e83&token_type=bearer&state=abc&expires_in=119>

### 2. 调用API

curl -X GET http://localhost:8080/user/userList -H "authorization: Bearer 9ae66acd-11e3-44d6-8dfe-7b24a6922d0e"

案例响应：

```
{
    "name": "lin",
    "age": "18",
    "email": "lin@j.com"
}
```
