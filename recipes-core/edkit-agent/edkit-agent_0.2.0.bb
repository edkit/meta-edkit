DESCRIPTION = "The agent to embed in the system to monitor"
SECTION = "e/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=5854bacb898ae2a0d43746828284b645"

DEPENDS = "json-c"

SRC_URI = "git://github.com/edkit/edkit-agent.git"
SRCREV="59ae933a9643fb61aa691c98d41fd5ea6248f175"
S = "${WORKDIR}/git"

inherit autotools pkgconfig

