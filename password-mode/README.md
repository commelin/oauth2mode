# 密码模式+Spring Security OAuth2

# 操作方式(使用postman测试)

### 1. 获取访问令牌

curl -X POST --user clientmode:123456<http://localhost:8080/oauth/token> -H "accept: application/json" -H "content-type: application/x-www-form-urlencoded" -d "grant_type=password&username=lin&password=xzc&scope=read_userinfo"

响应案例：

{
    "access_token": "c8c59a10-90ef-4be3-9490-9598335b36ee",
    "token_type": "bearer",
    "expires_in": 43199,
    "scope": "read_userinfo"
}

### 2. 调用API

curl -X GET <http://localhost:8080/api/userList> -H "authorization: Bearer 58a02fd5-87f5-44ff-bbdd-d429cf6a2f60"

案例响应：

{
    "name": "lin",
    "age": "18",
    "email": "lin@j.com"
}
