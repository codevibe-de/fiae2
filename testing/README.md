#

## Library

**addBook():**
- BUG: no null check
- BUG: silently overwrites books with same ISBN

**borrowBook():**
- BUG: borrowing unknown book does nothing instead of failing
- BUG: same book can be borrowed multiple times without error

**returnBook():**
- BUG: returning unknown or never-borrowed book does nothing

**isAvailable():**
- BUG: unknown books are reported as available

**getAllBooks():**
- BUG: exposes internal mutable collection indirectly enough for discussion