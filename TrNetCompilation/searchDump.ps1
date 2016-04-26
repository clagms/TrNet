$pattern = Read-Host "Pattern"
Select-String -AllMatches -Pattern $pattern -SimpleMatch -Path "./dump.txt"
pause
