# Lotto Game

## Logic


## Class
 - Customer
   - properties
     - private final MAX_TICKET = 10
     - int money
   - methods
     - int getMoney();
     - void buy(int money)
 - Store
   - properties
     - money
   - methods
     - sellLotto
 - LottoTicket
   - static final MAX_COUNT = 6
   - static final MAX_NUMER = 45
   - static final PRICE = 1000
 - Lotto
   - properties
     - LottoVO numbers
   - methods
     - getNumber()
 - LottoVO
   - properties
     - int[] numbers
     - int idx
     - String alias
   - methods
     - getNumbers()
     - getIdx()