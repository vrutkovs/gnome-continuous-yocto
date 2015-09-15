#
# Copyright (C) 2011 Colin Walters <walters@verbum.org>
#
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"
ALLOW_EMPTY_${PN} = "1"

PR = "3"

# We explicitly want -dbg packages
INSANE_SKIP_${PN} = "debug-deps"

RDEPENDS_${PN} += "     \
	 autoconf \
	 autoconf-archive \
	 automake \
	 bc \
	 binutils \
	 binutils-symlinks \
	 coreutils \
	 cpp \
	 cpp-symlinks \
	 ccache \
	 diffutils \
	 gcc \
	 gcc-symlinks \
	 g++ \
	 g++-symlinks \
	 gettext \
	 make \
	 intltool \
	 libtool \
	 libtool-dev \
	 perl-module-re \
	 perl-module-text-wrap \
	 pkgconfig \
	 findutils \
	 less \
	 ldd \
	 file \
	 elfutils \
	 libdw \
	 libelf \
	 libasm \
	 valgrind \
	 python-dev \
	 python3-dev \
	 python3-modules \
	 python3-misc \
	 libffi-dev \
	 bison flex \
	 git \
	 git-perltools \
	 gdb \
	 zip \
	 ruby \
	 cmake \
	 llvm-dev \
	 libxml-parser-perl \
	 gettext-dev \
	 libpci-dev \
	 bzip2-dev \
	 xz-dev \
	 zlib-dev \
	 gdbm-dev \
	 libtool-dev \
	 util-linux-libuuid-dev \
	 libpam-dev \
	 tiff-dev \
	 libjpeg-turbo-dev \
	 libjpeg-turbo-dbg \
	 libexif-dev \
	 libtool-dev \
	 libsndfile1-dev \
	 libatomics-ops-dev \
	 alsa-dev \
	 libogg-dev \
	 speex-dev \
	 libvorbis-dev \
	 libssp-dev \
	 libstdc++-dev \
	 libcap-dev \
	 libcap-bin \
	 libgpg-error-dev \
	 gpgme-dev \
	 libtasn1-dev \
	 libtasn1-bin \
	 libgcrypt-dev \
	 libattr-dev \
	 libacl-dev \
	 gnutls-dev \
	 icu-dev \
	 curl-dev \
	 nspr-dev \
	 ncurses-dev \
	 db-dev \
	 cracklib-dev \
	 e2fsprogs-dev \
	 krb5-dev \
         llvm-dev \
	 boost-dev \
	 libsqlite3-dev \
	 expat-dev \
	 intltool \
	 texinfo \
	 perl-misc \
	 python-pyparsing \
	 python-six \
	 cyrus-sasl-dev \
	 elfutils-dev \
	 libdw-dev \
	 libelf-dev \
	 libasm-dev \
	 libelf-dev \
	 libasm-dev \
	 libdw-dev \
	 libsmbclient-dev \
	 "
