DESCRIPTION = "The agent to embed in the system to monitor"
SECTION = "e/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=5854bacb898ae2a0d43746828284b645"

SRC_URI = "git://github.com/edkit/edkit-agent.git"
SRCREV="59ae933a9643fb61aa691c98d41fd5ea6248f175"
S = "${WORKDIR}/git"

inherit autotools

SRC_URI[md5sum] = "934bd36a4a3b1e7912fdff3ae764c7b6"
SRC_URI[sha256sum] = "09810190e0cf9ebf141ad780b994fce8198098fbeca418ec51df59eb51747182"
