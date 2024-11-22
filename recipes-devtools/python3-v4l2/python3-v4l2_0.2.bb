SUMMARY = "A Python binding for the v4l2 (video4linux2) userspace api, using ctypes"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"
SRC_URI = "https://files.pythonhosted.org/packages/1f/3c/a4e9abe360c76c7268cde9e7fbf7164c357063b29debbf0d36836097318c/v4l2-0.2.tar.gz"

SRC_URI[sha256sum] = "0d8f31f9d554ded4d0b50a31a7be5590b861df9e1ba256ee757e1c09175dd4a2"

inherit pypi setuptools3

DEPENDS = "python3-setuptools"
DEPENDS += "python3-setuptools-native"
PYPI_PACKAGE = "v4l2"
