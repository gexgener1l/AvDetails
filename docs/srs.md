# Содержание
1. [Введение](#1-введение)
2. [Требования пользователя](#2-требования-пользователя)  
   2.1 [Программные интерфейсы](#21-программные-интерфейсы)  
   2.2 [Интерфейс пользователя](#22-интерфейс-пользователя)  
   2.3 [Характеристики пользователей](#23-характеристики-пользователей)  
   2.4 [Предположения и зависимости](#24-предположения-и-зависимости)  
3. [Системные требования](#3-системные-требования)  
   3.1 [Функциональные требования](#31-функциональные-требования)  
   3.2 [Нефункциональные требования](#32-нефункциональные-требования)  
      3.2.1 [Атрибуты качества](#321-атрибуты-качества)  
4. [Модель предметной области](#4-модель-предметной-области)  
   4.1 [Диаграмма классов](#41-диаграмма-классов)  
   4.2 [Глоссарий к диаграмме классов](#41-глоссарий-к-диаграмме-классов)  
5. [Модель вариантов использования](#5-модель-вариантов-использования)  
   5.1 [Диаграмма вариантов использования](#51-диаграмма-вариантов-использования)  
   5.2 [Поток событий](#52-поток-событий)  
6. [Графический материал](#6-графический-материал)  
   6.1 [Диаграммы активности](#61-диаграммы-активности)  
      6.1.1 [Диаграмма активности 1](#611-диаграмма-активности-1)  
      6.1.2 [Диаграмма активности 2](#612-диаграмма-активности-2)  
      6.1.3 [Диаграмма активности 3](#613-диаграмма-активности-3)  
   6.2 [Диаграммы последовательности](#62-диаграммы-последовательности)  
      6.2.1 [Диаграмма последовательности 1](#621-диаграмма-последовательности-1)  
      6.2.2 [Диаграмма последовательности 2](#622-диаграмма-последовательности-2)  
      6.2.3 [Диаграмма последовательности 3](#623-диаграмма-последовательности-3)  
   6.3 [Диаграммы состояний](#63-диаграммы-состояний)  
      6.3.1 [Диаграмма состояния 1](#631-диаграмма-состояния-1)  
      6.3.2 [Диаграмма состояния 2](#632-диаграмма-состояния-2)  
      6.3.3 [Диаграмма состояния 3](#633-диаграмма-состояния-3)  
   6.4 [Диаграмма компонентов и развертывания](#64-диаграмма-компонентов-и-развертывания)  
7. [Тестирование](#7-тестирование)  
      7.1 [План тестирования](#71-план-тестирования)
      
## 1. Введение
AvDetails — это мобильное приложение для работы с автодеталями. Продукт предназначен для помощи пользователям в поиске, добавлении в корзину и управлении автодеталями, а также для администрирования ассортимента деталей.

Основные функции:
Поиск доступных автодеталей по категории или просмотр всего ассортимента.
Добавление автодеталей в корзину для оформления заказа.
Управление содержимым корзины и оформлением заказа.
Создание и управление профилем пользователя.
Административные функции для добавления и удаления автодеталей из ассортимента.

Продукт не включает в себя функции онлайн-оплаты или интеграции с системами автокомпании. Он предназначен для демонстрации возможностей разработки мобильных приложений с использованием современных технологий Android.

## 2. Требования пользователя

### 2.1 Программные интерфейсы

- Android SDK 21+
- Jetpack Compose для создания пользовательского интерфейса
- Room для локального хранения данных
- Kotlin Coroutines для асинхронных операций
- JNI для интеграции нативного кода C++

### 2.2 Интерфейс пользователя

Интерфейс будет реализован в виде мобильного приложения для Android с использованием Material Design 3. Основные экраны:

1. Поиск автобилетов

   ![search](/docs/mockups/search.jpg)

2. моя корзина

   ![bookings](/docs/mockups/Favourite.jpg)

3. Авторизация пользователя

   ![login](/docs/mockups/auth.jpg)

4. Добавление автодеталей (для администраторов)

   ![add](/docs/mockups/add.jpg)

5. Подтверждение корзины

   ![comfirm](/docs/mockups/confirm.jpg)

### 2.3 Характеристики пользователей

Целевая аудитория - люди, ищущие и услуги и автодетали для их автомобилей. Предполагается базовый уровень владения смартфоном и приложениями. Также предусмотрены пользователи с ролью администратора для управления автодеталями.

### 2.4 Предположения и зависимости

- Приложение будет работать на устройствах с Android 5.0 (API level 21) и выше
- Для хранения данных будет использоваться локальная база данных Room
- Часть функциональности может зависеть от нативного кода, реализованного на C++

## 3. Системные требования

### 3.1 Функциональные требования

Пользователь может осуществлять поиск доступных автодеталей по категориям или ключевым словам.
Пользователь может просматривать список всех доступных автодеталей.
Зарегистрированный пользователь может добавлять автодетали в корзину для оформления заказа.
Пользователь может просматривать содержимое своей корзины.
Пользователь может удалять автодетали из корзины или полностью очищать корзину.
Пользователь может создавать аккаунт и входить в систему.
Администратор может добавлять новые автодетали в систему.
Приложение должно отображать список доступных автодеталей.
Приложение должно отображать содержимое корзины пользователя.
Пользователь должен иметь возможность выбирать автодетали для добавления в корзину.

### 3.2 Нефункциональные требования

#### 3.2.1 Атрибуты качества

- Производительность: приложение должно быстро реагировать на действия пользователя
- Надежность: приложение должно сохранять данные пользователя и информацию о корзине даже при неожиданном закрытии
- Удобство использования: интерфейс должен быть интуитивно понятным и соответствовать принципам Material Design 3
- Безопасность: все данные пользователя должны храниться только локально на устройстве
- Масштабируемость: приложение должно эффективно работать с большим количеством автодеталей и пользователей

## 4. Модель предметной области
   
### 4.1 Диаграмма классов

   ![Alt-текст](/docs/class/classDiag.png)

### 4.2 Глоссарий к диаграмме классов

Класс/Интерфейс	Описание и Методы
MainActivity	Основной класс активности, который управляет экранами и взаимодействиями.
Методы: <ul><li>onCreate(savedInstanceState: Bundle)</li><li>CartScreen(userDao: UserDao, cartDao: CartDao, nickname: String)</li><li>AddAutoPartScreen(autoPartDao: AutoPartDao, nickname: String)</li><li>ProfileScreen(userDao: UserDao, nickname: String)</li><li>RegistrationScreen(userDao: UserDao, onRegisterSuccess: (String) -> Unit)</li><li>LoginScreen(userDao: UserDao, onLoginSuccess: (String) -> Unit)</li></ul>
UserDao	Объект доступа к данным для операций с пользователями.
Методы: <ul><li>suspend insertUser(user: User)</li><li>suspend getUserByNickname(nickname: String, password: String): User?</li><li>suspend getUserById(userId: Int): User?</li></ul>
AutoPartDao	Объект доступа к данным для операций с автодеталями.
Методы: <ul><li>suspend insertAutoPart(part: AutoPart)</li><li>suspend getAllAutoParts(): List<AutoPart></li><li>suspend getAutoPartById(partId: Int): AutoPart?</li><li>suspend deleteAutoPart(part: AutoPart)</li></ul>
CartDao	Объект доступа к данным для операций с корзиной.
Методы: <ul><li>suspend addToCart(cartItem: CartItem)</li><li>suspend getCartByUserId(userId: Int): List<CartItem></li><li>suspend removeFromCart(cartItem: CartItem)</li><li>suspend clearCart(userId: Int)</li></ul>
CartAdapter	Адаптер для управления и отображения данных корзины.
Методы: <ul><li>CartAdapter(cartItems: List<CartItem>, cartDao: CartDao, onItemRemoved: (CartItem) -> Unit)</li><li>onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder</li><li>onBindViewHolder(holder: CartViewHolder, position: Int)</li><li>getItemCount(): Int</li></ul>
User	Сущность, представляющая пользователя.
Поля: <ul><li>userId: Int</li><li>nickname: String</li><li>password: String</li></ul>
AutoPart	Сущность, представляющая автодеталь.
Поля: <ul><li>partId: Int</li><li>name: String</li><li>description: String</li><li>price: Double</li></ul>
CartItem	Сущность, представляющая элемент корзины.
Поля: <ul><li>cartItemId: Int</li><li>userId: Int</li><li>partId: Int</li><li>quantity: Int</li></ul>


## 5. Модель вариантов использования

### 5.1 Диаграмма вариантов использования

   ![Alt-текст](/docs/usage/userusage.drawio.png)
   ![Alt-текст](/docs/usage/admin.drawio.png)

### 5.2 Поток событий

# Содержание
1. [Актеры](#1-актеры)  
2. [Варианты использования](#2-варианты-использования)  
   2.1 [Зарегистрировать аккаунт](#21-зарегистрировать-аккаунт)  
   2.2 [Войти в систему](#22-войти-в-систему)  
   2.3 [Добавить автодетали](#23-добавить-автодетали)  
   2.4 [Удалить автодетали](#24-удалить-автодетали)  
   2.5 [добавление корзины](#25-добавление-корзины)  
   2.6 [Удаление корзины](#26-удаление-корзины)  
3. [Глоссарий](#3-глоссарий)  
   
### 1. Актеры

| Актор      | Описание                                                                 |
|------------|--------------------------------------------------------------------------|
| Пользователь | Человек, использующий систему для покупки услуг автодеталей. |
| Администратор | Человек, использующий систему для добавления услуг по автомобилям. |

### 2. Варианты использования
#### 2.1 Зарегистрировать аккаунт

**Описание**: Пользователь регистрирует новый аккаунт в системе.
- **Предусловия**: Пользователь не зарегистрирован.
- **Основной поток**:
  1. Пользователь открывает страницу регистрации.
  2. Вводит необходимые данные (никнейм, пароль).
  3. Нажимает кнопку "Зарегистрироваться".
  4. Система проверяет корректность данных и создает аккаунт.
  5. Система подтверждает успешную регистрацию.
- **Альтернативные потоки**:
  1. Пользователь уже существует — система отображает сообщение об ошибке.

#### 2.2 Войти в систему

**Описание**: Пользователь авторизуется в системе.
- **Предусловия**: Пользователь зарегистрирован.
- **Основной поток**:
  1. Пользователь открывает страницу входа.
  2. Вводит никнейм и пароль.
  3. Нажимает "Войти".
  4. Система проверяет учетные данные.
  5. Система авторизует пользователя и предоставляет доступ к функционалу.
- **Альтернативные потоки**:
  1. Неправильные данные — система отображает сообщение об ошибке.

#### 2.3 Добавить автодеталь
**Описание**: Администратор добавляет автодеталь.

**Предусловия**: Администратор авторизован.
**Основной поток**:
Администратор нажимает кнопку "Добавить автодеталь".
Заполняет поля (название детали, описание, цена).
Нажимает "Подтвердить данные".
Нажимает "Внести в базу".
Система добавляет автодеталь в базу данных.
#### 2.4 Удалить автодеталь
**Описание**: Администратор удаляет автодеталь.

**Предусловия**: Автодетали существуют в системе.
**Основной поток**:
Администратор нажимает кнопку "Просмотреть автодетали".
Администратор нажимает кнопку удаления рядом с автодеталью.
Система удаляет автодеталь из базы данных.
#### 2.5 Добавить автодеталь в корзину
**Описание**: Пользователь добавляет автодеталь в корзину.

**Предусловия**: Пользователь авторизован, автодетали существуют в системе.
**Основной поток**:
Пользователь нажимает кнопку "Просмотреть автодетали".
Пользователь выбирает автодеталь и нажимает кнопку "Добавить в корзину".
Система добавляет автодеталь в корзину пользователя.
Автодеталь отображается на странице "Моя корзина".
#### 2.6 Удалить автодеталь из корзины
**Описание**: Пользователь удаляет автодеталь из корзины.

**Предусловия**: Пользователь авторизован, в корзине есть автодетали.
**Основной поток**:
Пользователь переходит на страницу "Моя корзина".
Пользователь удерживает автодеталь или нажимает кнопку "Удалить" рядом с ней.
Система удаляет автодеталь из корзины пользователя.

### 3. Глоссарий

Термин	Описание
Пользователь	Человек, использующий систему для поиска, добавления автодеталей в корзину и управления покупками.
Администратор	Человек, использующий систему для добавления и удаления автодеталей.
Аккаунт	Учетная запись пользователя, содержащая данные для входа и работы в системе.
Автодеталь	Товар, связанный с автомобилями, который может быть добавлен в корзину пользователем.
Корзина	Раздел системы, где пользователь может просматривать, добавлять и удалять автодетали перед покупкой.
Добавление в корзину	Процесс добавления выбранной автодетали в корзину пользователем.
Удаление из корзины	Процесс удаления автодетали из корзины пользователя.
Регистрация	Процесс создания нового аккаунта в системе.
Авторизация	Процесс входа в систему с использованием учетных данных.
Добавление автодетали	Процесс добавления новой автодетали в систему администратором.
Удаление автодетали	Процесс удаления существующей автодетали из системы администратором.


## 6. Графический материал

### 6.1 Диаграммы активности

#### 6.1.1 Диаграмма активности 1

![Alt-текст](/docs/activity/authDiag.drawio.png)

#### 6.1.2 Диаграмма активности 2

![Alt-текст](/docs/activity/favDiag.drawio.png)

#### 6.1.3 Диаграмма активности 3

![Alt-текст](/docs/activity/DeleteDiag.drawio.png)

### 6.2 Диаграммы последовательности

#### 6.2.1 Диаграмма последовательности 1

![Alt-текст](/docs/sequence/seq1.png)

#### 6.2.2 Диаграмма последовательности 2

![Alt-текст](/docs/sequence/seqFav.png)

#### 6.2.3 Диаграмма последовательности 3

![Alt-текст](/docs/sequence/seqDelete.png)

### 6.3 Диаграммы состояний

#### 6.3.1 Диаграмма состояния 1

![Alt-текст](/docs/state/stateadd.drawio.png)

#### 6.3.2 Диаграмма состояния 2

![Alt-текст](/docs/state/stateAuth.drawio.png)

#### 6.3.3 Диаграмма состояния 3

![Alt-текст](/docs/state/stateCard.drawio.png)

### 6.4 Диаграмма компонентов и развертывания

![Alt-текст](/docs/component/Components.drawio.png)

## 7. Тестирование

### 7.1 План тестирования

# Содержание
1 [Введение](#introduction)  
2 [Объект тестирования](#items)  
3 [Атрибуты качества](#quality)  
4 [Риски](#risk)  
5 [Аспекты тестирования](#features)  
6 [Подходы к тестированию](#approach)  
7 [Представление результатов](#pass)  
8 [Выводы](#conclusion)

<a name="introduction"/>

## Введение

Вданном разделе описывается план тестирования приложения "AvDetails". Раздел предназначен для людей, выполняющих тестирование данного проекта. Цель тестирования - проверка соответствия реального поведения программы проекта и ее ожидаемого поведения.

<a name="items"/>

## Объект тестирования

В качестве объектов тестирования можно выделить следующие функциональные требования:

* Создание услуг
* Удаление услуг
* добавление в корзину услуг
* Отмена в корзине

<a name="quality"/>

## Атрибуты качества

1. Функциональность:
    - функциональная полнота: приложение должно выполнять все заявленные функции
    - функциональная корректность: приложение должно выполнять все заявленные функции корректно
2. Удобство использования:
    - интуитивно понятный интерфейс
    - все функциональные элементы имеют понятные названия
    - удобная навигация между разделами

<a name="risk"/>

## Риски

К рискам можно отнести:
* Потеря локальных данных при сбое устройства
* Конфликты при одновременном доступе к данным
* Проблемы совместимости с различными версиями Android

<a name="features"/>

## Аспекты тестирования

В ходе тестирования планируется проверить реализацию основных функций приложения:

### Управление автодеталями
* Создание новой автодетали
* Удаление автоделати

### Управление корзины
* добавление в корзину
* Удаление из корзины

### Интерфейс
* Корректное отображение всех элементов
* Работа навигации
* Адаптивность интерфейса

<a name="approach"/>

## Подходы к тестированию

При тестировании будет использован ручной подход.

<a name="pass"/>

## Представление результатов

| Сценарий              | Действие                                                      | Ожидаемый результат                                   | Фактический результат                             | Оценка        |
|-----------------------|-------------------------------------------------------------|----------------------------------------------------|-------------------------------------------------|---------------|
| 001-1: Запуск приложения | Запустить приложение на устройстве Android                   | Успешный запуск приложения                          | Приложение запускается                            | Тест пройден |
| 001-2: Отображение интерфейса | Проверка соответствия интерфейса макетам                  | Интерфейс соответствует макетам                     | Интерфейс соответствует макетам                   | Тест пройден |
| 002-1: Добавление автодетали | Нажать кнопку "Добавить автодеталь" и заполнить поля        | Отображение автодетали в списке                     | Автодеталь отображается                           | Тест пройден |
| 002-2: Удаление автодетали   | Выбрать автодеталь и нажать "Удалить"                      | Удаление автодетали из списка                       | Автодеталь удаляется                              | Тест пройден |
| 003-1: Добавление в корзину   | Добавить автодеталь в корзину                              | Отображение автодетали в корзине                    | Автодеталь отображается в корзине                 | Тест пройден |
| 003-2: Удаление из корзины    | Удалить автодеталь из корзины                              | Удаление автодетали из корзины                      | Автодеталь удаляется                              | Тест пройден |
| 004-1: Сохранение данных      | Проверка сохранения данных при перезапуске                | Сохранение всех данных                              | Данные сохраняются локально                       | Тест пройден |
| 005-1: Навигация              | Проверка переходов между экранами                         | Корректная навигация                                | Навигация работает                                | Тест пройден |



## Общий вывод
Базовый функционал приложения реализован и работает стабильно. Основные функции выполняются корректно. Требуется расширение функциональности в соответствии с планом развития проекта. Приложение может добавлять автодели в корзину, но требует дальнейшего развития для полного соответствия заявленным требованиям.

<a name="conclusion"/>

## Выводы

Данный тестовый план позволяет проверить основной функционал приложения AvDetails. Успешное прохождение всех тестов не гарантирует полной работоспособности на всех устройствах и версиях Android, однако позволяет утверждать о корректной работе основных функций приложения. Тестирование должно проводиться регулярно при внесении существенных изменений в код проекта.
