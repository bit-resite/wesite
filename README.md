# Requirement
  * push는 무조건 하나의 작업 플로우가 끝났을 때만 수행
  * push하기 전에 반드시 pull하고 conflict 발생 시 해결
  * pc를 여러개 사용할 때 작업이 끝나면 commit & push하기
-------
  
# Convention
  * Commit Message <br>
    `[add | impl | remove | fix | another   package.targetClass(.targetMethod())]` (+ etc comment)

  * Example <br>
    - class  case : `[impl dao.UserDao class]`
    - method case : `[add dao.UserDao.add()] (Refactoring scheduled for tomorrow)`
-------
