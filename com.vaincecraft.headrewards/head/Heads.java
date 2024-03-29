package com.vaincecraft.headrewards.head;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.vaincecraft.headrewards.commands.Command;

public enum Heads
{
  GIFTBOX1("YTAzYmQwMDQyMTcyOWNkNjM1Y2QzYjQ4MjQzNDMwYWQ0N2NmNzA3MDE4YTU5MTZmZjU5NTQ5ZDVlY2Q2Zjg3OSJ9fX0=", "christmas1"),
  GIFTBOX2("NGZlYTM2YTllNzNhYjNiMDhkNjQ3OWNkMWUwMDA0NDk1ZWYyOTIxMmZhN2NmZjU2YjU1NmZkNDZiMGRkYTcxIn19fQ==", "christmas2"),
  GIFTBOX3("MjBmNDJlOWU1Y2UxNjFkMWQ3YTY4NTc3NTllYTFjZjI4MDZlOTFkM2JiOWY0NGNhZTIyNjhjMzhlOWM4N2FkZSJ9fX0=", "christmas3"),
  GIFTBOX4("ZDRiMTFiMWQyZmRkN2RkOGI4OWY2YzlmNzMyZDViN2FhNDU2YTQ5YmQxNTY2ODdiYzhmZTg5MmI2ZGJmYjIwYSJ9fX0=", "christmas4"),
  GIFTBOX5("ZjBhZmE0ZmZmZDEwODYzZTc2YzY5OGRhMmM5YzllNzk5YmNmOWFiOWFhMzdkODMxMjg4MTczNDIyNWQzY2EifX19", "christmas5"),
  GIFTBOX6("MTNjZmJmMmJkZmQ0ODUxNGJmYmFjZTk1MThjNzY2NDExMmRmMmMxNzNlOGM3YWQ5MmIzZTY1NjIxYTllZDZlMCJ9fX0=", "christmas6"),
  GIFTBOX7("NDYyMTRiMTQ1YTkwYmI2OTFkN2ZhOTExM2RlZDdjYTljZGJjNmE4OWRlMGYxNGQxNWQ0MzEzYTEzOTNiYSJ9fX0=", "christmas7"),
  GIFTBOX8("NWE2NDZmM2VkNTQyM2I2OGI0N2I4NThjMzMzMzFjOTgyMDY1ZWExZGQ2MjcyOTUyMTg0YjY0NTg0ZjUxOTFkIn19fQ==", "christmas8"),
  GIFTBOX9("YmRhYzlhNTE4MTNhYmNiNjY2ZWUyYzJjYTg0Y2VmY2ZiMjFlNThiN2IwMWFlMGVhN2U5OWQzNWYzMjNhIn19fQ==", "christmas9"),
  GIFTBOX10("ZjU2MTJkYzdiODZkNzFhZmMxMTk3MzAxYzE1ZmQ5NzllOWYzOWU3YjFmNDFkOGYxZWJkZjgxMTU1NzZlMmUifX19", "christmas10"),
  GIFTBOX11("NjRhYmU4MWU2ZjQ5NjFlMGY2YmQ4MmYyZDQxMzViNmI1ZmM4NDU3MzllNzFjZmUzYjg5NDM1MzFkOTIxZSJ9fX0=", "christmas11"),
  GIFTBOX12("YmQ3YTlmNmVkMDhkZDIxN2ZkZjA5ZjQ2NTJiZjZiN2FmNjIxZTFkNWY4OTYzNjA1MzQ5ZGE3Mzk5OGE0NDMifX19", "christmas12"),
  GIFTBOX13("YjNiYTdiYzhlM2MwOTNiZDQ4YzFmNzdiZjQ4ZTM1YmZhMGVhYzlhYjQ4ZDBhZDEzZWJkOWUzYzIyZjcxYWZhIn19fQ==", "christmas13"),
  GIFTBOX14("MTYyMzRhZTdkNTU5MDNlYThiYzM0NDEzY2Q1MmRlZDNiMzdjOTJlZWU1YWU1MzNmYzUxMjZhNjU0NjFmMTFmIn19fQ==", "christmas14"),
  GIFTBOX15("MmY4YTRmOGMzMWY5NjQ0NzI2Yjc0YzNhMTYxNjljNTJkMmIyMzIyNDYwOWM5ZmMyY2FhZWJkZjg4ODY0NSJ9fX0=", "christmas15"),
  GIFTBOX16("NzU0MTlmY2U1MDZhNDk1MzQzYTFkMzY4YTcxZDIyNDEzZjA4YzZkNjdjYjk1MWQ2NTZjZDAzZjgwYjRkM2QzIn19fQ==", "christmas16"),
  GIFTBOX17("YTNlNThlYTdmMzExM2NhZWNkMmIzYTZmMjdhZjUzYjljYzljZmVkN2IwNDNiYTMzNGI1MTY4ZjEzOTFkOSJ9fX0=", "christmas17"),
  GIFTBOX18("NmM4NjUyYmZkYjdhZGRlMTI4ZTdlYWNjNTBkMTZlYjlmNDg3YTMyMDliMzA0ZGUzYjk2OTdjZWJmMTMzMjNiIn19fQ==", "christmas18"),
  GIFTBOX19("NWM3MTJiMTk3MWM1ZjQyZWVmZjgwNTUxMTc5MjIwYzA4YjgyMTNlYWNiZTZiYzE5ZDIzOGMxM2Y4NmUyYzAifX19", "christmas19"),
  GIFTBOX20("YTg3NDU4OTg0YThhYWU1NzAxM2QxYjllOGRmYTRjM2I0ZDI1ZTQyNjE4MjMzOTI0Zjc0NDc0MTM0ZjYyYSJ9fX0=", "christmas20"),
  GIFTBOX21("YWMzODIxZDRmNjFiMTdmODJmMGQ3YThlNTMxMjYwOGZmNTBlZGUyOWIxYjRkYzg5ODQ3YmU5NDI3ZDM2In19fQ==", "christmas21"),
  GIFTBOX22("NGFjYjNjMWUxYjM0Zjg3MzRhZWRmYWJkMWUxZjVlMGIyODBiZWY5MjRmYjhiYmYzZTY5MmQyNTM4MjY2ZjQifX19", "christmas22"),
  GIFTBOX23("Y2E3NTMyOGViYTdjYjVhMDUyMzI2ZjU5ZGRhZjY3YTFjZWJkNGU1NWJiNjgwMWMwM2MzMTQyZTI4ZTEifX19", "christmas23"),
  GIFTBOX24("NDdlNTVmY2M4MDlhMmFjMTg2MWRhMmE2N2Y3ZjMxYmQ3MjM3ODg3ZDE2MmVjYTFlZGE1MjZhNzUxMmE2NDkxMCJ9fX0=", "christmas24"),
  GIFTBOX25("ODRlMWM0MmYxMTM4M2I5ZGM4ZTY3ZjI4NDZmYTMxMWIxNjMyMGYyYzJlYzdlMTc1NTM4ZGJmZjFkZDk0YmI3In19fQ==", "christmas25"),
  GIFTBOX26("MTBjNzVhMDViMzQ0ZWEwNDM4NjM5NzRjMTgwYmE4MTdhZWE2ODY3OGNiZWE1ZTRiYTM5NWY3NGQ0ODAzZDFkIn19fQ==", "christmas26"),
  GIFTBOX27("MmYyZDE4OTVmZmY0YjFiYjkxMTZjOGE5ZTIyOTU5N2Y2OWYzZWVlODgxMjI3NzZlNWY5NzMzNTdlNmIifX19", "christmas27"),
  GIFTBOX28("N2ZjZDFjODJlMmZiM2ZhMzY4Y2ZhOWE1MDZhYjZjOTg2NDc1OTVkMjE1ZDY0NzFhZDQ3Y2NlMjk2ODVhZiJ9fX0=", "christmas28"),
  GIFTBOX29("MWM2Mjc0YzIyZDcyNmZjMTIwY2UyNTczNjAzMGNjOGFmMjM4YjQ0YmNiZjU2NjU1MjA3OTUzYzQxNDQyMmYifX19", "christmas29"),
  GIFTBOX30("ZWUzYThmZDA4NTI5Nzc0NDRkOWZkNzc5N2NhYzA3YjhkMzk0OGFkZGM0M2YwYmI1Y2UyNWFlNzJkOTVkYyJ9fX0=", "christmas30"),
  GIFTBOX31("Nzg1MzZhNDYxNjg0ZmM3YTYzYjU0M2M1ZGYyMzQ4Y2Q5NjhiZjU1ODM1OTFiMWJiY2M1ZjBkYjgzMTY2ZGM3In19fQ==", "christmas31"),
  GIFTBOX32("ZWQ5N2Y0ZjQ0ZTc5NmY3OWNhNDMwOTdmYWE3YjRmZTkxYzQ0NWM3NmU1YzI2YTVhZDc5NGY1ZTQ3OTgzNyJ9fX0=", "christmas32"),
  GIFTBOX33("OTI4ZTY5MmQ4NmUyMjQ0OTc5MTVhMzk1ODNkYmUzOGVkZmZkMzljYmJhNDU3Y2M5NWE3YWMzZWEyNWQ0NDUifX19", "christmas33"),
  GIFTBOX34("NDNlMTY1ODU3YzRjMmI3ZDZkOGQ3MGMxMDhjYzZkNDY0ZjdmMzBlMDRkOTE0NzMxYjU5ZTMxZDQyNWEyMSJ9fX0=", "christmas34"),
  GIFTBOX35("NTlmMDc0MzU3NmJiYTRhMjYyMjQ4MDU0ODk3MGI3MjE1NDNkMmM0NTc5NTVlOGRkNWM0ZjlkZGI2YTU2Yjk1YyJ9fX0=", "christmas35"),
  GIFTBOX36("YjczYTIxMTQxMzZiOGVlNDkyNmNhYTUxNzg1NDE0MDM2YTJiNzZlNGYxNjY4Y2I4OWQ5OTcxNmM0MjEifX19", "christmas36"),
  GIFTBOX37("ZjU3YjJlZTY1NmQ3Yjg2NWMzZmFkZDViMTQyOGMzNThkNDc2M2Y0MTc4YWM1OTlkNjA0ODY5YTE5ZDcifX19", "christmas37"),
  GIFTBOX105("NmEzMjlkYjRlZWU0NjU4N2QxOTQ4ZDIyZTUwNTQ4NGYxZWM4MjZiYWExOTM4ZGVkYzUzMjBmYTYzZGYxYTVlIn19fQ==", "christmas38"),
  GIFTBOX106("ODg0YjhhMzJiYzZkZTI4ODRiYTMxMzk4ZDViMDI4ZDFhNGZhNzdmNTlhNDE1YjdlNmY2MmYyNjIzZjRmNiJ9fX0=", "christmas39"),
  GIFTBOX107("ZTgxYTM5OWU0ZDJlOGYxYTgyOGUxYzRiYzRjYTk5ZWZlZDE1MDhmM2Y0MjFkOTg4NzQ3MjlhZTY0ZDgzIn19fQ==", "christmas40"),
  GIFTBOX108("N2JiZThmZDFhYTM5ZjE1MDc2ZTg4NGRmZTZkZGI5YTNmMzc2MWRiMzFlMmIxZjk5NDBiNWRmZDM0ZDFjNGQifX19", "christmas41"),
  
  //Easter
  GIFTBOX38("ZWViMzM1MTgyZGI1ZjNiZTgwZmNjZjZlYWJlNTk5ZjQxMDdkNGZmMGU5ZjQ0ZjM0MTc0Y2VmYTZlMmI1NzY4In19fQ==", "easter1"),
  GIFTBOX39("YjJjZDVkZjlkN2YxZmE4MzQxZmNjZTJmM2MxMThlMmY1MTdlNGQyZDk5ZGYyYzUxZDYxZDkzZWQ3ZjgzZTEzIn19fQ==", "easter2"),
  GIFTBOX40("Yzc2NTk1ZWZmY2M1NjI3ZTg1YjE0YzljODgyNDY3MWI1ZWMyOTY1NjU5YzhjNDE3ODQ5YTY2Nzg3OGZhNDkwIn19fQ==", "easter3"),
  GIFTBOX41("NGViNWFiYjEyMzUyN2E3YTFmNWM5NTg5NzE1OTY0YjU5Zjc2ODI0OTI2ZDNiOTgyZmE4NDExZDQ2MDZjNzkifX19", "easter4"),
  GIFTBOX42("YjNkNjliMjNhZTU5MmM2NDdlYjhkY2ViOWRhYWNlNDQxMzlmNzQ4ZTczNGRjODQ5NjI2MTNjMzY2YTA4YiJ9fX0=", "easter5"),
  GIFTBOX43("MjY0NDMwZTQ5M2ZlYjVlYWExNDU1ODJlNTRlNzYxYTg2MDNmYjE2Y2MwZmYxMjY4YTVkMWU4NjRlNmY0NzlmNiJ9fX0=", "easter6"),
  GIFTBOX44("NjU2ZjdmM2YzNTM2NTA2NjI2ZDVmMzViNDVkN2ZkZjJkOGFhYjI2MDA4NDU2NjU5ZWZlYjkxZTRjM2E5YzUifX19", "easter7"),
  GIFTBOX45("NThiOWUyOWFiMWE3OTVlMmI4ODdmYWYxYjFhMzEwMjVlN2NjMzA3MzMzMGFmZWMzNzUzOTNiNDVmYTMzNWQxIn19fQ==", "easter8"),
  GIFTBOX46("MTViOGRjYmVhMjdmNDJmNWFlOTEwNDQ1ZTA1ZGFjODlkMzEwYWFmMjM2YTZjMjEyM2I4NTI4MTIwIn19fQ==", "easter9"),
  GIFTBOX47("ZmI4YjJiZGZjNWQxM2I5ZjQ1OTkwZWUyZWFhODJlNDRhZmIyYTY5YjU2YWM5Mjc2YTEzMjkyYjI0YzNlMWRlIn19fQ==", "easter10"),
  GIFTBOX48("OTg4OWYxMWM4ODM4YzA5ZTFlY2YyZjgzNDM5ZWJjYjlmMzI0ZTU2N2IwZTlkYzRiN2MyNWQ5M2U1MGZmMmIifX19", "easter11"),
  GIFTBOX49("ZDM2ZmU4M2M0MmM2Y2U3Mzg2Y2YyMzMzYTFjNTk1ZDBiNDMzZGE3YmM1NTkyYjg2ODY2ODU1MWQ2OWI5YjAifX19", "easter12"),
  GIFTBOX50("NDY0MmFmYTM5Njg1M2I4MWIxN2JlZjVjOGQ3YTQ0YzEyZGU2ODlhNTZhZjQ3NDg0NjY3OTgzOTlkYTNjZmVhZSJ9fX0=", "easter13"),
  GIFTBOX51("ZWYzMjlmMWI0NDhlYWFiMmY5ZjA0NDZmYzBiMjMxZWI3NzUxMzczYWZlNDc0MjZlNDk1MGY3ZDA4NjIwZjA4ZCJ9fX0=", "easter14"),
  GIFTBOX109("MTdkYWZmNDIzOWU1NjBmN2Y1M2IxY2NiY2ViYzYxNGYwZGRmMzU4MWE2ZmFkNWJkODE1NjcyOTFlY2Y0NTcxIn19fQ==", "easter15"),
  GIFTBOX110("MWYxOGI5YTQzNmEyN2Y4MTNjMjg3ZWI2NzM3OWVmOGFkYmZkYzcwYWZhZjMwNGM0M2IxNjZjZTk4NmRkOCJ9fX0=", "easter16"),
  GIFTBOX111("ODNjMjVhN2ExODgxOTZiMTg3MTcyNjRmZmU4MzdjYTM0OGNmNzE5ZTgyNzE3OWVkYzRiNzhjYmNiOGM3ZGQ4In19fQ==", "easter17"),
  GIFTBOX112("ZGEzZGRjZTJjNTU2ZjIyZmRhMzE3OTc4MzlmZmQxZDA0MjhhZmUxMmE0NWMwNzM1NTk1MWY0NDRjNzc0YWQifX19", "easter18"),
  GIFTBOX113("ZTJiZjA1ZDNlNzU2YzMzNzk4NzdhOGFjOGZkZmE0NDE4Y2RlNmY1Y2M3ZTk5MTAzYTEyZmY5YWMxNDk5NyJ9fX0=", "easter19"),
  GIFTBOX114("NTYyODUzMWViNWYwNTY5ZWRhZTE2YzhhNDNlYjIyZWVjZjdjMTUyMzViODM1YWUxNDE0YzI2OWNhZDEyY2E3In19fQ==", "easter20"),
  GIFTBOX115("N2MzZDcxMWZmM2M0ODkxMzNlM2Y0NjY1NWNlYjE1Nzk4OTdmMTg0YmZmYmU2ZWZmYTJlN2I2YmJlZjQ3YWIzIn19fQ==", "easter21"),
  GIFTBOX116("NTM1ODIzMzcxMDgxODIxMmMwMTNhMTEwMzk4NTI0MjUzYzVkOTQ5ZjUwZmIwOTljOTUxZDBjYjNiNDEwZWRmZiJ9fX0=", "easter22"),
  GIFTBOX117("ZTg5ZDY1YWM3NTg2YTI3YzBjNWQyMjZmZDYzY2I5ODliZWU3YzYyYTRlODBkZDFmMWFlYTJlMjJjMTYxMWNkZiJ9fX0=", "easter23"),
  
  //Halloween
  GIFTBOX52("MTFmNTRmZjliYjQyODUxOTEyYWE4N2ExYmRhNWI3Y2Q5ODE0Y2NjY2ZiZTIyNWZkZGE4ODdhZDYxODBkOSJ9fX0=", "halloween1"),
  GIFTBOX53("MTE3MWJhYTVhZDE2N2JkMzNlNDE5ZmU3NDVmN2IwMTg0MGNiNmQ3ZThkN2FlYzZjZGEzMWNlMmQ1Y2Y2MSJ9fX0=", "halloween2"),
  GIFTBOX54("OWRhMzkyNjllZjQ1ZjgyNWVjNjFiYjRmOGFhMDliZDNjZjA3OTk2ZmI2ZmFjMzM4YTZlOTFkNjY5OWFlNDI1In19fQ==", "halloween3"),
  GIFTBOX55("MTMxZjhiNzk1MjY3ZjJlMGI2ZTRmMGIzNTIxNTllYzZmMmQ4NjQxOGEyNDZkYmUxMTNlNTM2MmNhNmI3ZWI5In19fQ==", "halloween4"),
  GIFTBOX56("NGNmMWIzYjNmNTM5ZDJmNjNjMTcyZTk0Y2FjZmFhMzkxZThiMzg1Y2RkNjMzZjNiOTkxYzc0ZTQ0YjI4In19fQ==", "halloween5"),
  GIFTBOX57("ZTFjOTkzNGNkZDU1YTllNjMzNTk2MmE4Nzc2MjYwZDc5MTYxNTA4MTM0ODNlOTU2YzI4NjFiMTFhOGEyNjdmNyJ9fX0=", "halloween6"),
  GIFTBOX58("ZGQ1NGRhM2JjMGE5MzdkZGY2MjVlMzM5YjdlMzJhNGIwMjM5NGUzMWQyY2JkODFmYzFjMWYyNWIyNTdmNjkifX19", "halloween7"),
  GIFTBOX59("NjhkMjE4MzY0MDIxOGFiMzMwYWM1NmQyYWFiN2UyOWE5NzkwYTU0NWY2OTE2MTllMzg1NzhlYTRhNjlhZTBiNiJ9fX0=", "halloween8"),
  GIFTBOX60("ZGRlZGJlZTQyYmU0NzJlM2ViNzkxZTdkYmRmYWYxOGM4ZmU1OTNjNjM4YmExMzk2YzllZjY4ZjU1NWNiY2UifX19", "halloween9"),
  GIFTBOX61("NWNhNDc5NDZkNzI4NTgzNGVmMWUxNzYyOWY3MjgyYjY1ZTkxNDM1OTdmZTdiZjJiZTFkZTI0M2YxYzYzIn19fQ==", "halloween10"),
  GIFTBOX62("ZWJmZTliN2FmNjhkYzEyNjRhNmZjOTY5ZjNkN2IwOGU1MGU2MWU2ZWU5MWNlYTgzZGFhYmQxODgyMGYwZWYifX19", "halloween11"),
  GIFTBOX63("OTM3ZjhmOTVjMTI1NzU3Y2JmNzY3YTExZjUyYTRlNjY5MWNlMThhMjU5NzhjNjhjZmEzOTEwMzYwZmUifX19", "halloween12"),
  GIFTBOX64("ZGQ1MDI2MzkyMzNkOGFlZWRjM2Y0NzNmYTlmODhlM2ZkMjZiNmVkYWFjMjlhODM4ZWI4ZDllMDI2NDc1YWIifX19", "halloween13"),
  GIFTBOX65("NGM2NTcwZjEyNDI5OTJmNmViYTIzZWU1ODI1OThjMzllM2U3NDUzODMyNzNkZWVmOGIzOTc3NTgzZmUzY2Y1In19fQ==", "halloween14"),
  GIFTBOX66("Y2Q1NDE1NDFkYWFmZjUwODk2Y2QyNThiZGJkZDRjZjgwYzNiYTgxNjczNTcyNjA3OGJmZTM5MzkyN2U1N2YxIn19fQ==", "halloween15"),
  GIFTBOX67("YjcxNzVhM2JkYzI5YzViMTE0ZTc1NmIyMmRhYWUzZWIyMWFkNWJhZWVmNjQ3NjIzNzQ3OTcyMTJhOWIwNDcifX19", "halloween16"),
  GIFTBOX68("ZDdjYmUwNjFiNDQ1Yjg4Y2IyZGY1OWFjY2M4ZDJjMWMxMjExOGZlMGIyMTI3ZTZlNzU4MTM1NTBhZGFjNjdjZiJ9fX0=", "halloween17"),
  GIFTBOX69("MjdmNGFmOGQzNGU1NzhjODU1ZGU3MjUxOWQ5MjFkYzJhNDJjMjM0NjI3MTk4NmQwMzljZWZjODkwOGJkY2JhIn19fQ==", "halloween18"),
  GIFTBOX70("ZjY3YjI3ZmI3ZTI5ZWM5OGUxY2Q0YThmODQ2Njg1NmQ5ZWYzZjJlOWZiZDlhZWQ2MzExZjhhYmU1NGI2YWIyIn19fQ==", "halloween19"),
  GIFTBOX71("ZTI3MzcyODA5YjU2OTQ2NDZmNDRkN2E4MzdkNGZlNjZlNWVmNjJhZTcyNzAxMTcxNjUxYjNhNzgwY2IxZjljIn19fQ==", "halloween20"),
  GIFTBOX72("Y2Q0ZmRhZDVhNjEwNGFhNTQ5ZDFlNzZkNzNhM2M2ZmUzYzY3MjRiZjA5ZjdmZmNjMDJmMzNmOWVkZTdmYWRlIn19fQ==", "halloween21"),
  GIFTBOX73("Y2IzOWI1YWFkNWVjZmY5NDY3M2NjYTRmOTFmZTc0ZWQyYTQyODhjZjY3M2E3NzAxMGY3NTcwZjFhNTc1MjAifX19", "halloween22"),
  GIFTBOX74("M2U5MWU5NTgyMmZlOThjYzVhNTY1OGU4MjRiMWI4Y2YxNGQ0ZGU5MmYwZTFhZjI0ODE1MzcyNDM1YzllYWI2In19fQ==", "halloween23"),
  GIFTBOX75("NGIxYjc3YTY4NGJlNGZmYTIxMjE5YzNmYmZmMTYzZWFkYWFkY2M2MzA5Mzk5NjQ2YzE1ZDYxMWZmN2IyY2U0In19fQ==", "halloween24"),
  GIFTBOX76("OTIxYzkwOGE1NTY4NjcxNDc2YzZjNmJhY2U3YzdlNDczODU3YzhmMTJlN2JhZTIxYzg3MzliM2QxNzY0OWQzMSJ9fX0=", "halloween25"),
  GIFTBOX77("MzZhYWU4NmRhMGNkMzE3YTQ3ZmE2NjY4ZmQ0Nzg1YjVhN2E3ZTRlZDllN2JjNjg2NTJiYWUyNzk4NGI4NGMifX19", "halloween26"),
  GIFTBOX78("MWE2NDEwMzc4OTMwZDhiMTQxMjdkNDM4OGRlNzQ2MzZkMzRlZTI1MTdmM2IxZjJjYjZjZTYyYTFlNzIxNTMifX19", "halloween27"),
  GIFTBOX79("NzhjNGE2NDFmMDE1N2ZlZTNmMzhkYmM5YmY2OWE0MmE0MjhlNzQ1MDMxM2IxZTRlMGJlMTJiZGFhMDYifX19", "halloween28"),
  GIFTBOX80("NjFlZTlkMjI1YmM2ZDZiYTI4N2E2Nzc5ZTI4OTQyNDFiZWRiMzA0NGY1YzAzMjE3ZmQ3NjQ2MzlhNDM0NTcifX19", "halloween29"),
  GIFTBOX81("OThiN2NhM2M3ZDMxNGE2MWFiZWQ4ZmMxOGQ3OTdmYzMwYjZlZmM4NDQ1NDI1YzRlMjUwOTk3ZTUyZTZjYiJ9fX0=", "halloween30"),
  GIFTBOX118("OGYxNDllYThjYmE0MWY3YjVjNTIxZDNjZWM1OGY0ZGEzN2RiODZlNzE5NmM1Nzg3YmZmMjc4Njk3MTA5ZjQ4In19fQ==", "halloween31"),
  GIFTBOX119("ODMzZGUwMjRhOTg4N2FiZGMwNzM3N2MwY2JmMzRiOWU2OTFmOWVmYjQxNGUzMDE4YmU0NzJlMzJhMTM0YmUyNSJ9fX0=", "halloween32"),
  GIFTBOX120("ZGQzMTE3M2U3YjdjNzhlNWU0OGRjZmY2NmQ1Nzk4MGFlY2EzODI0Y2Q4NTg0YWFjNDZkNzdjMjYwYzM4YmI0YyJ9fX0=", "halloween33"),
  GIFTBOX121("NjZkZThkNTgzZWViZjRhMzM2MWNlOTVjN2Q2NGNiNTJkMzU4NTcwNTlkNTE0NjJiOGE5MDkzYTQxYmZlMzljMCJ9fX0=", "halloween34"),
  
  //Summer
  GIFTBOX82("YWE0YjdlODc4MjFkYjRlNmU0MmU3OGQ3ZjI2MGI2Mzc5OTNkNmJlOGRlOTRmNDNlNDMxNzViYWZmOTFmNSJ9fX0=", "summer1"),
  GIFTBOX83("NWE1YWIwNWVhMjU0YzMyZTNjNDhmM2ZkY2Y5ZmQ5ZDc3ZDNjYmEwNGU2YjVlYzJlNjhiM2NiZGNmYWMzZmQifX19", "summer2"),
  GIFTBOX84("N2ExOWU4NzVhMDg1M2ZlYzJkMzZlODMyOGVjNmY2NjQ2MjRhZTk5MWZmZGQ5MzJmNTM0ODllM2QzMTRlIn19fQ==", "summer3"),
  GIFTBOX85("ZGUyNjExNTE4MDM3NTM2NmJiMzRlZDE2YzI2Y2UyZDA0ZDkxZjdmNTI3Mjc2YWMyNDcwZTllYmFmMmRhZjM1In19fQ==", "summer4"),
  GIFTBOX86("M2JhYjY3NjFjNTQ2MjY4YzNmMDRmZjZiMjljMzg4MWM3YjQ3ZjVmZGU5ZjQyNWQ2MmQ5NTk1ODQxOWQyIn19fQ==", "summer5"),
  GIFTBOX87("Y2M5NmJjOGM1Nzg2YmJiZjlmYjg5ZWJiZDU3ZTkxZDkwM2NmYjU1MWJhODY4OGYxYWVmZGZkMzNkZWFiZTkifX19", "summer6"),
  GIFTBOX88("MzZkNGQwNTM3NGRmY2FiYTJjZDI0NWViMjk0YjE2MTFjZDhlZTEzMzkxNTljM2RhMWIxN2MxODdiYzBiYjZiIn19fQ==", "summer7"),
  GIFTBOX89("MTE4YjQ0NzE2M2M2NzhhYmI5NTZhMzkyODg3OGYzZjJkNWJiMTU3NzJiMTM4ZmRhYmI3MTJjNTliYjhhZDM1In19fQ==", "summer8"),
  GIFTBOX90("MWRkZjZmZTAyZTVjYjM2YjE1OGFlNGMxZjQ0M2E0M2YzYTE2YmUxNzlhYTIwOGI1NjExNzM3ZjM1N2JlZTg3In19fQ==", "summer9"),
  GIFTBOX91("NzFhNzIyYjZiMzU5YWJmYjgyODIxOTg1MWYxOTI0ODFjZGJiYzE3ZDM4NmYxNmI2NzkzMDk3YzdkZjhlMTI2ZCJ9fX0=", "summer10"),
  GIFTBOX92("OTY3NDY5Y2YzOGU0OTQxNGUzODM1YmQxYzc3MGNiN2UxYzFjZjQ3ZTU0ZDIyYWU2OGViNTkyYzZmMmFmZCJ9fX0=", "summer11"),
  GIFTBOX93("YTZiYzM2NDY3M2MzNGRjMzRhOTU3ODI5MmYzMGFhOWYyZDRiOTQ2ODExNWI4NjEyOWU3Njc4NmNmZjgyOTlkIn19fQ==", "summer12"),
  GIFTBOX94("Y2FkMmU2NDYzOGRhZmRlYjI0Yzk1NjU4YjZhYmFiMjM2ZDIzZWI5MzQxZTk4YTI0MzdiYTYxMTk0OTQ4OWEifX19", "summer13"),
  GIFTBOX95("YzU5ZjRiNGYxYThiZjRmNGFkNjg3NGY5MzBhYzdkN2U5M2U5OTA2MWY4NzlhYjgwNDI4ZjUyZTc1N2EyOSJ9fX0=", "summer14"),
  GIFTBOX96("ODI1YTk4MWI0OWQ0NWU0ODFiYjhlMjE4NmY2MzBmZWUyNGYxODkyNWZiZDQ3MjljMTMzZWZhNjgxZTZjOCJ9fX0=", "summer15"),
  GIFTBOX97("NWJlNDVhNWU5Yzk1ZDUyMjM2NDBlNzNlYzAyOGEwZDRiYTBlNTk0ZjU1Y2U0Nzc5MmRmNDA5N2IzMjRiZGRmIn19fQ==", "summer16"),
  GIFTBOX98("MTBjODcxOWI2YjFmZGFlZTU5YTc4OTU1NTI2N2FkY2ZhMWU0MjYwODg5ZmRmNzA4ZTdjYTg3M2MwNTUxZDkifX19", "summer17"),
  GIFTBOX99("OTUzNjZjYTE3OTc0ODkyZTRmZDRjN2I5YjE4ZmViMTFmMDViYTJlYzQ3YWE1MDM1YzgxYTk1MzNiMjgifX19", "summer18"),
  GIFTBOX100("ZWMzYWIxNTY5YzhmODU1MmVjODQ2YWE3OTZhZWU5N2M3ZWY0Yzg1YWEwOTNlZjVlMWFkODdiYTUxNCJ9fX0=", "summer19"),
  GIFTBOX101("NDFiOGI0NDJhZjE1NmQ2NTRmNDUyNTVmM2ZkMzZlOGFkNmM2MWFlNTVlZjQxZTgwNDEyZTdmYTZjZDI4M2UyIn19fQ==", "summer20"),
  GIFTBOX122("MWMxNTE3MGZiZTY0M2Y5OGMyYmFlYmY0MTM3YmU4ZGE3YWVkOTY1ZjI5NWFhYmFjYjVmODg4YzZiMTY1NWIifX19", "summer21"),
  GIFTBOX123("N2E2YmY5MTZlMjhjY2I4MGI0ZWJmYWNmOTg2ODZhZDZhZjdjNGZiMjU3ZTU3YThjYjc4YzcxZDE5ZGNjYjIifX19", "summer22"),
  GIFTBOX124("MmY1YTIzZjAzYzQ4MWVkNWY3YTA1NzJkMmNlOWE3Zjg3MTM5Yjg1ZGQ4MTI0MTQ0MTU0MmJlOTc3MzExZDExYSJ9fX0=", "summer23"),
  GIFTBOX125("YWE0ZDk5NWI3ZGM5ZGNlNTE0YzZhOWU5ZmZkNzM0NDE1MDViMmM1YTgyYzk3NGEyY2Y0YTczNGY1OGI5Zjc0YSJ9fX0=", "summer24"),
  GIFTBOX126("NmY4MjdiNWYxMjZjZjU4OGY5MzU1Njc4Y2FlZTMwNTQ0MjZkYTBmYTcxNmRmYTVmMmFlNzk5YmJiMjdiODMifX19", "summer25"),
  GIFTBOX127("ZDU4NjcwNTUxZjdmZjEzYWZhYjIzOTMxOGExMGJhZDIzMjdlZTc0MmUxNTc4MzdlYTE3ODVlZjQ0M2QzYTU3NiJ9fX0=", "summer26"),
  GIFTBOX128("NGY2ODFjODdkMzhlOWQ0YjA0YjNjZGI5NTdkMjQ0MjRlYzRmODIyYzJlMTZmM2E3ZWNkMjY3YzdlYTFmNDhiMCJ9fX0=", "summer27"),
  
  //Mobs
  GIFTBOX133("OTNjOGFhM2ZkZTI5NWZhOWY5YzI3ZjczNGJkYmFiMTFkMzNhMmU0M2U4NTVhY2NkNzQ2NTM1MjM3NzQxM2IifX19", "mobegg1"),
  GIFTBOX134("ZDQyOWZmMWQyMDE1Y2IxMTM5ODQ3MWJiMmY4OTVmN2I0YzNjY2VjMjAxZTRhZDdhODZmZjI0Yjc0NDg3OGMifX19", "mobegg2"),
  GIFTBOX135("OTQxOWYxNWZmNTRkYWU1ZDA0MGY5YjlkOGViMmE4OTg5ZTY3NjcxMDkyMmEwY2ExNjRkYTYxM2NhNjFlOSJ9fX0=", "mobegg3"),
  GIFTBOX136("NWM2ZDVhYmJmNjhjY2IyMzg2YmYxNmFmMjVhYzM4ZDhiNzdiYjBlMDQzMTUyNDYxYmQ5N2YzZjYzMGRiYjhiYyJ9fX0=", "mobegg4"),
  GIFTBOX137("NDFiM2IwMmUzNmFlOTg1MGRmMjVhYTA5YzJjYTVhMTdiOWM2NjE2Y2U1M2UwYjE0MWFkMzYwYjZjNjdjIn19fQ==", "mobegg5"),
  GIFTBOX138("YzU3OWE3NDNiNjZiZDBiNGQ1NTk4OThlZDFiOTg1N2E0OWYxMTI3ZDlkMjM3YmVkM2RjOTdiY2ViOTM3OWE1In19fQ==", "mobegg6"),
  GIFTBOX139("NTI3YWQ1MWRkNzczYjcyZGNhMWMxM2U2ZjM1NDdhODMxODFhYWQ5MTE2NTI4Mjk5OWJiZGYxM2EzYjNjOSJ9fX0=", "mobegg7"),
  GIFTBOX140("NjNlMDZlZDg4MDkyNDNlMzE3MzkzZjYxNjI2NzliMmMxZmU2OTExZWRhMmQzMGNiOTljZmM4MmQzNDdjYiJ9fX0=", "mobegg8"),
  GIFTBOX141("ZmY0ODFmNzczNDdmZTU5YzA4MzY2NWM5ZWZiYjQ5MDcxZDQ5M2VhMjAyNzQ1NGFlZTg3NzM1ZDYzYmYzYiJ9fX0=", "mobegg9"),
  GIFTBOX142("NDQ5MDg4ODYxZmMxZTE0YjYwNWE1MTU0ZDc5ZmE3ZGQ2NWUwNDFhNWM2MzVkMjQ3NDRiM2UxNTI1MzUifX19", "mobegg10"),
  GIFTBOX143("ZjNiMzY0MjVjYmZhNDhlNDY4NGM4ZTFhNzE0Nzc5MTllMGE0NmI2MTM1MTFhODQzNmM3NzViMTVmNTYxNSJ9fX0=", "mobegg11"),
  GIFTBOX144("NDM5OWM5NzNkNjQ5NmQxZDI1ODQ5MmMyOGQ0Yzk1OTU2YWMzYTI1Mzc2MmJmMTVmNzY0NGFmMWY1NzI4ZGQifX19", "mobegg12"),
  GIFTBOX145("NTMzYWNhZTZlMDc1YTU3OGNjZmM3ZGMyZDVhMTVkYmNjZmE4ZjU5YzYwOWY5NzAzODg5ZWY1NGM3NDJjNTYifX19", "mobegg13"),
  GIFTBOX146("MTY2MTcxMzEyNTBlNTc4MzMzYTQ0MWZkZjRhNWI4YzYyMTYzNjQwYTlkMDZjZDY3ZGI4OTAzMWQwM2FjY2Y2In19fQ==", "mobegg14"),
  GIFTBOX147("ODdjNjNkOTA3OWI3NWY5MDk3OTc4M2NmMDdjYTcyNmY2NWUzMDI0NDE1YWM2MjJhN2M5MDZjZDI1MDgyYWYifX19", "mobegg15"),
  GIFTBOX148("MzdjMGQwMTBkZDBlNTEyZmZlYTEwOGQ3YzVmZTY5ZDU3NmMzMWVjMjY2Yzg4NGI1MWVjMGIyOGNjNDU3In19fQ==", "mobegg16"),
  GIFTBOX149("YzQ0MmMyMjhmMDk5ZmRmYzFjNmI0NmRmYzgwYjI1MmQ4MWY3ZmIxNzM5ZGViMTZlZTdhNTk3YzE3ZjdjOSJ9fX0=", "mobegg17"),
  GIFTBOX150("ZmUxMTlhYWE0OTk5NjQ4YTc1Yjk3OGVmYWZhOTdlZGFiMWNkY2ExZmYxZDgzMDFiYTYxY2RjMmRiMTYwNmUyMiJ9fX0=", "mobegg18"),
  GIFTBOX151("MTE4NTY1N2MzOGFjZGQ4Zjk1ZTFkMmNkMTExNWJiMGYxMTEzOWFkMmIzY2U0NDIyNjdlNjk3MDZkOTE2ZSJ9fX0=", "mobegg19"),
  GIFTBOX152("ZDA2MzEwYTg5NTJiMjY1YzZlNmJlZDQzNDgyMzlkZGVhOGU1NDgyYzhjNjhiZTZmZmY5ODFiYTgwNTZiZjJlIn19fQ==", "mobegg20"),
  GIFTBOX153("Mzc3MDU1Y2FkYWNiYjBmOGYzNWMxZDE4YWNjMmVkODZlMGJjYzZkNzNkZGE3MWU0YzU5ZjdlYTI4YjdiMjdiNiJ9fX0=", "mobegg21"),
  GIFTBOX154("OTMzMGFmMTdmODUxMmVkM2I0OWU3OGJjYTdlZjJkODNmMmRjMWU1OThhOGNiNTQyZWNjM2I2YmVjZWU5ZjU3In19fQ==", "mobegg22"),
  GIFTBOX155("NWQ1OWFhNzhjYjdlOWI2Y2E2ZmVlNDEyMTMyOTA1OWRkNjhhZmRkYzBjOGI1M2E5MDZiNzk1Mzk5NGU4YTc2In19fQ==", "mobegg23"),
  GIFTBOX156("YWZiZGNlZWY3NzNkOTU5YjQ5ZGRkOTYxNWY0MjY5YzE3NmUyMzE1NGQ0NTc1MjY2NzQyOGRjNGUzZmQ0ZCJ9fX0", "mobegg24"),
  GIFTBOX157("NzdmODQ0YmZlYTI1NDI5ZDQ1ZTFmY2Y5NmVmNjY1NGRmYWFhNmZjOTAyZGMxYjZiNjhjMGFiYzEzNDM0NDcifX19", "mobegg25"),
  GIFTBOX158("NWY3ZGU5ZmFmYThmY2I3N2Q1OTQ0ZTYyOGI3MjA0MmI5Zjc5ODhkZTQzZTQyMjk4M2M3OGQzNzYyZDZkNyJ9fX0=", "mobegg26"),
  GIFTBOX159("OGU4ZTNkZTc3MThhNTQ1NTNkZDJmYzViMjQxNWEwOGIwNWYyMzM5Yjc3MmZlMTgxYjY1YzUwN2ZkYTRlMzRjMSJ9fX0=", "mobegg27"),
  GIFTBOX160("MjkxYWJjYWI3YTIwYjI4MTk1YzBmMTc4NmRiMjhjNzY3MGMyOTc5MjQzZGU3MTcwM2IwNGU5ZDkzZjU5YWE4ZCJ9fX0=", "mobegg28"),
  GIFTBOX161("OTM4MWRmZWFjOGEwNTBkMzMwZmRlMDU4YmFkNWY1ZTZmMjI4ZjI4Y2QzNzk3NjFjMTE0N2UxN2M0ZWQ2MDViIn19fQ==", "mobegg29"),
  GIFTBOX162("ZmYxZWViMzg3ZDU1YjA4ODZhNjliNmVjNjJhNmU2OTcwNmYzMmFiYTI1NDdlMTA1ODMwNjBiOTc2MzQxZjliZSJ9fX0=", "mobegg30"),
  GIFTBOX163("MzY0YjRjOTRkZGE5MDllY2M3NzhkYjkzNTcyYjg0N2E1ZGY1MWM0YTQ5ODk0ZDZhOWRmNTliOGRmOTc4NDJjNSJ9fX0=", "mobegg31"),
  GIFTBOX164("MTVhNDVlMjRjYWRjMThmMzA1MjkxYWY0NWEyMmZjOGIzNjA3YTY3NWJhYTMxZWQ1ODNkM2E1NmIxNTIyM2M1YyJ9fX0=", "mobegg32"),
  GIFTBOX165("ZDA0MjUyMjE2MjMxYjNmNzQ0YzlmZjRhY2U3MDg0YWU5ZjQxNjRmOGIzODRjNjU0MTA4NDhhMTk2MTdhZjRkIn19fQ==", "mobegg33"),
  GIFTBOX166("NWM0NmM1NjhlOGI1YzU1ODUzYTkyODY5ZWExOWMwMGI3NzIwYzMyOGEyZjE2YzU5NTBiOWUyZTg5N2ZjMjdhMSJ9fX0=", "mobegg34"),
  GIFTBOX167("NWQ1ZTdkMTkxNDc4ZWZhZmUyM2E2NTRkZTgwMjc2MGY0MmEwZGQ4M2RmYzk4MTdmODdkNDYwZmNmMzI5NzhkZiJ9fX0=", "mobegg35"),
  GIFTBOX168("NmVhYmQ4ZmZmYzAzNzE4NzdlODhmZmMzY2QwMzE1MjAwNTM0ZGQyZmNjNjAzNDU4ODAwMDczNmZiODAwMzNlNSJ9fX0=", "mobegg36"),
  GIFTBOX169("MWFiMjQ2MTFiYjM3Y2UzOTcxZmRiZjAxYmEzZjExYmQyZTRjNzJmNWQ0MGI2ZDhkOGQ1MzZkNjllNjk1Y2QwYyJ9fX0=", "mobegg37"),
  GIFTBOX170("MTNhMjk1NTJiM2FiYWYzODgxNDViZThhOTA2N2U1ZWE0ZDFhZjk0NWU3YmY1ZTJjYTg1MmNlYzg3ZmQxYjE3YiJ9fX0=", "mobegg38"),
  GIFTBOX171("MjQ4MGNkOTU3N2UyMTczZTFjOWRlNWU0MTMxOGJkODU5Njk2MjE1YTBhN2RlOTI0MmYwMWMwMWI4ZTZjMDZiZiJ9fX0=", "mobegg39"),
  GIFTBOX172("NWNlODMwZjIwZDBkZmIyNDI3Nzk3NTFmN2E1YzY4ZTY3ODg4OGY3Mjc1ODYxNDY1NGI2NTU2MjVjZjk0MzI0MyJ9fX0=", "mobegg40"),
  GIFTBOX173("NWI0NWFhZTI0MTc3OWYwNjE3ZmZhZmY0NjhmM2YyY2Y2NjZkMmY4YTgwMzAwMmY5YWUxYmEwZjE0ZWQ3OWZkZCJ9fX0=", "mobegg41"),
  GIFTBOX174("NDBmZDhkODZlNzA1N2FhZTMzZjVkNzlkY2IwMzY4NWM4OGM4MTM3Y2ZjYjIzNDliYzg3NGI5Zjg3ZTkzNDI3NiJ9fX0=", "mobegg42"),
  GIFTBOX175("MzM3MjIzZDAxOTA2YWI2M2FmMWExNTk4ODM0M2I4NjM3ZTg1OTMwYjkwNWMzNTEyNWI1NDViMzk4YzU5ZTFjNSJ9fX0=", "mobegg43"),
  GIFTBOX176("ZGM3ZWI4NjFmZDk5OTliZjg3YTMwMGUzZGRkMDNjNTczMTNkZGZiYTIyMWQxYzdkNGJkNjJjZWYzMTQ0NmNhMSJ9fX0=", "mobegg44"),
  GIFTBOX177("NWNiYzZiZDkyNzI4ZDc5Y2ZhNmQ4ZjIzY2JhZTlkOTEyZjQ5NTkyMGI5ZTk1ZWY2OTFhMTk2N2ZlZjhhNDQ1MyJ9fX0=", "mobegg45"),
  GIFTBOX178("OWE4MzlkODI1NmM4MWNmMWRiOGRhOGZmM2Y3YjgwY2NlMmY4NjViODBjOWY2NmFlYTUzNDBlNjk3ZWEzZTIxOSJ9fX0=", "mobegg46"),
  GIFTBOX179("YmQyOWIyNTU3OWY5ZDNhNjdiNjEyYWU4ZWY5NmIzMWZlY2E2YzllN2U2YzcwYWM4MTE1NmQ3NzhjYmU3ZGI5ZCJ9fX0=", "mobegg47"),
  GIFTBOX180("MmU0Mzg1ZDU4ZmU0NmRkOTY0MjJmMzFkMzViYmQxNTY4ZTU4MTliYmRiN2ExOTZjOWYxMTM0MjQ1ODJjZjk3NyJ9fX0=", "mobegg48"),
  GIFTBOX181("NzliNjI1YjgwY2ZiMGJhZjA0ZWViYmQyY2IxZmY5ZjEwMTBiMDJmNGRmMjFiM2JhZjg2ZWI4MTJhYjdlYmE4YiJ9fX0=", "mobegg49"),
  GIFTBOX182("ZGI1MjJmNmQ3N2MwNjk2YzlkMWYyYWQ0OWJmYTNjYjgyMDVhNWU2MjNhZjFjNDIwYmQ3NDBkYzQ3MTkxNGU5NyJ9fX0=", "mobegg50"),
  GIFTBOX183("ZjIxNTRlMzg1ZjljY2IxODdiNTNjZjI5MGZlOWEyNGY5OGM3ZDU4M2MzNjg5ODZjNzgwNmMzMTJjM2YyOWQ3OSJ9fX0=", "mobegg51"),
  GIFTBOX184("ZTRhZDc4ZjdhZGE3YzYzNzY0NDllZjk0OWM5Yzg3ZmRlY2U4ODJiNWEyZjE0Y2ZiZjhlYWM2ZmVhNjU3ZjRjNyJ9fX0=", "mobegg52"),
  GIFTBOX185("OWRjMDg0Yjc4NzQyNjg5NzMwMDZjODk3YTAzZDg5MDZjYzliM2RmOGMzOWJjZTkzZDg3ZWMwZGY1MDdiYmUwZCJ9fX0=", "mobegg53"),
  GIFTBOX186("ZWM1YjZmOGVmMWQ3NWY3M2E1MjkwYzkzNjdkMmI5YjgyM2JjOTYzZGUyYTM2NmZkNjU1MGJjYWNlMjc1MTIwNSJ9fX0=", "mobegg54"),
  GIFTBOX187("Y2MzNGYxMTQ0MDc1ODY2MWQzZTU5OWMyODdiMjE2OTg3YzRhOWU0YzZkYTc0NDE4ZTJhYzMyYzI2YTgxMWQzOSJ9fX0=", "mobegg55"),
  GIFTBOX188("OGZkNDk4M2UzMGIyNzdmMGI5N2I3ZDhjNmY4YTAzNTgyMDFiZTIyNmEyYzU1ZTJhMGQzOTBjMzk0MmVjMmRmNSJ9fX0=", "mobegg56"),
  GIFTBOX189("M2JlYWM1MDFlOTdkYjFjYzAzNTI4N2QwNjhhOGViNTM4ZTU1ZWY4MDJmNWNjYTI1NjgzOTMzYTI0MzEzNmMifX19", "mobegg57"),
  
  //Special
  GIFTBOX102("YmQ2OWUwNmU1ZGFkZmQ4NGU1ZjNkMWMyMTA2M2YyNTUzYjJmYTk0NWVlMWQ0ZDcxNTJmZGM1NDI1YmMxMmE5In19fQ", "testaguileft"),
  GIFTBOX103("MTliZjMyOTJlMTI2YTEwNWI1NGViYTcxM2FhMWIxNTJkNTQxYTFkODkzODgyOWM1NjM2NGQxNzhlZDIyYmYifX19", "testaguiright"),
  GIFTBOX104("YmQ2OWUwNmU1ZGFkZmQ4NGU1ZjNkMWMyMTA2M2YyNTUzYjJmYTk0NWVlMWQ0ZDcxNTJmZGM1NDI1YmMxMmE5In19fQ", "testaguiback"),
  GIFTBOX129("ZmI4YjJiZGZjNWQxM2I5ZjQ1OTkwZWUyZWFhODJlNDRhZmIyYTY5YjU2YWM5Mjc2YTEzMjkyYjI0YzNlMWRlIn19fQ==", "testaguieaster"),
  GIFTBOX130("NWE1YWIwNWVhMjU0YzMyZTNjNDhmM2ZkY2Y5ZmQ5ZDc3ZDNjYmEwNGU2YjVlYzJlNjhiM2NiZGNmYWMzZmQifX19", "testaguisummer"),
  GIFTBOX131("NjFlZTlkMjI1YmM2ZDZiYTI4N2E2Nzc5ZTI4OTQyNDFiZWRiMzA0NGY1YzAzMjE3ZmQ3NjQ2MzlhNDM0NTcifX19", "testaguihalloween"),
  GIFTBOX132("YTAzYmQwMDQyMTcyOWNkNjM1Y2QzYjQ4MjQzNDMwYWQ0N2NmNzA3MDE4YTU5MTZmZjU5NTQ5ZDVlY2Q2Zjg3OSJ9fX0=", "testaguichristmas"),
  GIFTBOX190("ZDQyOWZmMWQyMDE1Y2IxMTM5ODQ3MWJiMmY4OTVmN2I0YzNjY2VjMjAxZTRhZDdhODZmZjI0Yjc0NDg3OGMifX19", "testaguimobegg");
	
  private ItemStack item;
  private String idTag;
  private String prefix = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUv";
  
  private Heads(String texture, String id)
  {
    item = Command.customhead(prefix + texture, id);
    idTag = id;
  }
  
  public ItemStack getItemStack()
  {
    return item;
  }
  
  public ItemStack ErrorItem()
  {
    ItemStack errorname = new ItemStack(Material.SKULL_ITEM, 1);
    SkullMeta errornamemeta = (SkullMeta)errorname.getItemMeta();
    List<String> errorlore = new ArrayList<String>();
    errorlore.clear();
    errorlore.add(ChatColor.RED + "Unknown head!");
    errornamemeta.setLore(errorlore);
    errornamemeta.setDisplayName(ChatColor.RED + "ERROR!");
    errorname.setItemMeta(errornamemeta);
    
    return errorname;
  }
  
  public String getName()
  {
    return idTag;
  }
}
