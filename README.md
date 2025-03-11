# 📌 안드로이드 코드 리팩토링 핵심 가이드

## ✅ 1️⃣ 코드 구조 개선 (Clean Architecture 적용)

### 🔹 리팩토링 포인트
- **모듈화(Modularization)**: UI, 데이터, 도메인 계층 분리 → 유지보수성 향상
- **MVVM (Model-View-ViewModel) 패턴 적용**: UI 로직을 ViewModel로 분리
- **UseCase 적용**: 비즈니스 로직을 재사용 가능하게 분리

### 🔹 프로젝트 구조 예시
```
app/
 ├── data/  → API, DB 관련 로직 (Retrofit, Room 등)
 ├── domain/  → UseCase, Repository Interface
 ├── presentation/  → UI 관련 코드 (Activity, Fragment, ViewModel)
 ├── di/  → Hilt 의존성 주입 관련 코드
```

### 🔹 ViewModel 적용 예제
```kotlin
class MainViewModel(private val repository: UserRepository) : ViewModel() {
    private val _user = MutableLiveData<User>()
    val user: LiveData<User> = _user

    fun fetchUser(userId: String) {
        viewModelScope.launch {
            _user.value = repository.getUser(userId)
        }
    }
}
```

---

## ✅ 2️⃣ UI 코드 정리 (XML & Jetpack Compose 최적화)

### 🔹 XML 정리
- **ConstraintLayout 사용** → 중첩 레이아웃 최소화
- **스타일, 테마 적용** → `styles.xml`에서 관리

```xml
<style name="PrimaryButton">
    <item name="android:background">#6200EE</item>
    <item name="android:textColor">#FFFFFF</item>
</style>
```

### 🔹 Jetpack Compose 적용
```kotlin
@Composable
fun UserCard(user: User) {
    Card(modifier = Modifier.padding(8.dp)) {
        Column {
            Text(user.name, style = MaterialTheme.typography.h6)
            Text(user.email, style = MaterialTheme.typography.body1)
        }
    }
}
```

---

## ✅ 3️⃣ 성능 최적화 (메모리 & 네트워크 최적화)

### 🔹 메모리 최적화
- **불필요한 `context` 참조 제거** (메모리 누수 방지)
- **이미지 최적화** (Glide 사용, 크기 조절)

```kotlin
Glide.with(context).load(imageUrl).into(imageView)
```

### 🔹 네트워크 최적화
- **Retrofit & OkHttp 캐싱 적용**
- **불필요한 API 호출 줄이기 (Flow, LiveData 활용)**

```kotlin
interface ApiService {
    @GET("users/{id}")
    suspend fun getUser(@Path("id") id: String): Response<User>
}
```

---

## ✅ 4️⃣ 안전한 코드 작성 (Null Safety & 예외 처리)

### 🔹 Null Safety 적용
- **Nullable 변수 처리 (`?.`, `!!`)**
- **`try-catch`로 예외 처리**

```kotlin
fun getUserName(user: User?): String {
    return user?.name ?: "Unknown"
}
```

---

## ✅ 5️⃣ 코드 가독성 개선 (Naming, Extension, KTX 활용)

### 🔹 올바른 네이밍 규칙
- **View 요소** → `btnLogin`, `txtUserName`
- **LiveData 변수** → `_userList`, `userList`

### 🔹 확장 함수(Extension) 활용
```kotlin
fun ImageView.load(url: String) {
    Glide.with(this.context).load(url).into(this)
}

imageView.load("https://example.com/image.jpg")
```

---

## ✅ 6️⃣ 의존성 관리 (DI 적용: Hilt or Koin)

### 🔹 Hilt 적용 예제
```kotlin
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.example.com/")
            .build()
    }
}
```

---

## ✅ 7️⃣ 테스트 코드 작성 (단위 테스트, UI 테스트)

### 🔹 단위 테스트 (JUnit + Mockito)
```kotlin
@RunWith(MockitoJUnitRunner::class)
class UserRepositoryTest {
    @Mock
    lateinit var apiService: ApiService

    @Test
    fun testGetUser() = runBlocking {
        val user = User("John", "john@example.com")
        `when`(apiService.getUser("1")).thenReturn(Response.success(user))

        val result = apiService.getUser("1").body()
        assertEquals("John", result?.name)
    }
}
```

### 🔹 UI 테스트 (Espresso)
```kotlin
@Test
fun testLoginButton_click() {
    onView(withId(R.id.btnLogin)).perform(click())
    onView(withText("로그인 성공")).check(matches(isDisplayed()))
}
```

---
