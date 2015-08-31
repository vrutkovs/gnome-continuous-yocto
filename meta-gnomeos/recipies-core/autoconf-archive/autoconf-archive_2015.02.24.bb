require autoconf-archive.inc


PARALLEL_MAKE = ""

LICENSE = "GPLv2 & GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI[md5sum] = "686ece8b7db6897d9bb9db1723e419b4"
SRC_URI[sha256sum] = "69715bdd078f552ca85e498a94543e11cb8bcdf0359e659b84d84d19372b0dc5"

EXTRA_OECONF += "ac_cv_path_M4=m4"
BBCLASSEXTEND = "native nativesdk"
