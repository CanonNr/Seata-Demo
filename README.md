# QA
1. 服务A修改数据后（此时MySQL层面已经提交了本地事务）立刻修改影响的行数据，B服务回滚，会导致因为回滚数据的新旧值不同导致回滚失败。
