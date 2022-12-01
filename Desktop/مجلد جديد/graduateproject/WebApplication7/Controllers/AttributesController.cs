using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace WebApplication7.Controllers
{
    public class AttributesController : ApiController
    {

        public IEnumerable<Attributes> Get(string permit ,string quality, string health, string material, string slope,
            string landtype, string withinf, string withoutf
            , string landlocation, string rent, string elevator, string floor, string park
            , string propertycontract, string rebound
            , string pavedstreet, string streetype, string vitalcenter, string services, int streetnumber ,string prices)
        {
            using (ExpertSystemEntities entities = new ExpertSystemEntities())
            {
                //quality and health
                object qual = entities.Attributes.Select(e => e.qualitygood);
                object heal = entities.Attributes.Select(e => e.healthgood);
                object mat = entities.Attributes.Select(e => e.blocks);
                if (quality.Equals("good"))
                {
                     qual = entities.Attributes.Select(e => e.qualitygood);
                    //decimal value for quality good from database
                    if (health.Equals("good"))
                    {
                         heal = entities.Attributes.Select(e => e.healthgood);
                        //decimal value for health good from database
                        if (material.Equals("blocks"))
                        {
                            mat = entities.Attributes.Select(e => e.blocks);
                        }
                        else if (material.Equals("natural"))
                        {
                            mat = entities.Attributes.Select(e => e.naturalstone);
                        }
                        else if (material.Equals("industrial"))
                        {
                            mat = entities.Attributes.Select(e => e.industrialstone);
                        }
                        else if (material.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Select(e => e.stoneandinsulatingmaterials);
                        }
                        


                    }
                }
                if (quality.Equals("bad"))
                {
                     qual = entities.Attributes.Select(e => e.qualitybad);
                    if (health.Equals("good"))
                    {
                         heal = entities.Attributes.Select(e => e.healthgood);
                        if (material.Equals("blocks"))
                        {
                            mat = entities.Attributes.Select(e => e.blocks);
                        }
                        else if (material.Equals("natural"))
                        {
                            mat = entities.Attributes.Select(e => e.naturalstone);
                        }
                        else if (material.Equals("industrial"))
                        {
                            mat = entities.Attributes.Select(e => e.industrialstone);
                        }
                        else if (material.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Select(e => e.stoneandinsulatingmaterials);
                        }


                    }
                }

                if (quality.Equals("good"))
                {
                     qual = entities.Attributes.Select(e => e.qualitygood);
                    if (health.Equals("bad"))
                    {
                         heal = entities.Attributes.Select(e => e.healthbad);
                        if (material.Equals("blocks"))
                        {
                            mat = entities.Attributes.Select(e => e.blocks);
                        }
                        else if (material.Equals("natural"))
                        {
                            mat = entities.Attributes.Select(e => e.naturalstone);
                        }
                        else if (material.Equals("industrial"))
                        {
                            mat = entities.Attributes.Select(e => e.industrialstone);
                        }
                        else if (material.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Select(e => e.stoneandinsulatingmaterials);
                        }


                    }
                }
                if (quality.Equals("bad"))
                {
                     qual = entities.Attributes.Select(e => e.qualitybad);
                    if (health.Equals("bad"))
                    {
                         heal = entities.Attributes.Select(e => e.healthbad);
                        if (material.Equals("blocks"))
                        {
                            mat = entities.Attributes.Select(e => e.blocks);
                        }
                        else if (material.Equals("natural"))
                        {
                            mat = entities.Attributes.Select(e => e.naturalstone);
                        }
                        else if (material.Equals("industrial"))
                        {
                            mat = entities.Attributes.Select(e => e.industrialstone);
                        }
                        else if (material.Equals("naturalwith"))
                        {
                            mat = entities.Attributes.Select(e => e.stoneandinsulatingmaterials);
                        }


                    }
                }
                //slope
                object sl = entities.Attributes.Select(e => e.littleslope);
                object lands = entities.Attributes.Select(e => e.stoneland);
                if (slope.Equals("little"))
                {
                     sl = entities.Attributes.Select(e => e.littleslope);
                    if (landtype.Equals("stone"))
                    {
                         lands = entities.Attributes.Select(e => e.stoneland);
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Select(e => e.agriculturalland);
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Select(e => e.sandland);
                    }
                    
                }
                if (slope.Equals("large"))
                {
                     sl = entities.Attributes.Select(e => e.largeslope);
                    if (landtype.Equals("stone"))
                    {
                        lands = entities.Attributes.Select(e => e.stoneland);
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Select(e => e.agriculturalland);
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Select(e => e.sandland);
                    }
                }

                if (slope.Equals("midle"))
                {
                     sl = entities.Attributes.Select(e => e.midslope);
                    if (landtype.Equals("stone"))
                    {
                        lands = entities.Attributes.Select(e => e.stoneland);
                    }
                    else if (landtype.Equals("agriculture"))
                    {
                        lands = entities.Attributes.Select(e => e.agriculturalland);
                    }
                    else if (landtype.Equals("sand"))
                    {
                        lands = entities.Attributes.Select(e => e.sandland);
                    }
                }
                //elevator
                object elv = entities.Attributes.Select(e => e.elevatorexist);
                object floarloc = entities.Attributes.Select(e => e.landfloar);
                if (elevator.Equals("exist"))
                {
                     elv = entities.Attributes.Select(e => e.elevatorexist);
                    if (floor.Equals("landfloar"))
                    {
                        floarloc = entities.Attributes.Select(e => e.landfloar);
                    }
                    else if (floor.Equals("midfloar"))
                    {
                        floarloc = entities.Attributes.Select(e => e.midfloar);
                    }
                    else if (floor.Equals("upperfloar"))
                    {
                        floarloc = entities.Attributes.Select(e => e.upperfloar);
                    }
                    else if (floor.Equals("underland"))
                    {
                        floarloc = entities.Attributes.Select(e => e.underlandfloar);
                    }
                    
                }
                if (elevator.Equals("not exist"))
                {
                     elv = entities.Attributes.Select(e => e.elavatornotexist);
                    if (floor.Equals("landfloar"))
                    {
                        floarloc = entities.Attributes.Select(e => e.landfloar);
                    }
                    else if (floor.Equals("midfloar"))
                    {
                        floarloc = entities.Attributes.Select(e => e.midfloar);
                    }
                    else if (floor.Equals("upperfloar"))
                    {
                        floarloc = entities.Attributes.Select(e => e.upperfloar);
                    }
                    else if (floor.Equals("underland"))
                    {
                        floarloc = entities.Attributes.Select(e => e.underlandfloar);
                    }
                }
                //prices
                object pr = entities.Price.Select(e => e.East);
                if (prices.Equals("east"))
                {
                     pr = entities.Price.Select(e => e.East);
                }
                else if (prices.Equals("west"))
                {
                     pr = entities.Price.Select(e => e.West);
                }
                else if (prices.Equals("south"))
                {
                     pr = (IQueryable<double>)entities.Price.Select(e => e.South);
                }
                else if (prices.Equals("north"))
                {
                     pr = (IQueryable<double>)entities.Price.Select(e => e.North);
                }
                //inside and outside 
                object inout = entities.Attributes.Select(e => e.withinf);
                object locA = entities.Attributes.Select(e => e.A);
                if (withinf.Equals("inside"))
                {
                     inout = entities.Attributes.Select(e => e.withinf);
                    if (landlocation.Equals("A"))
                    {
                         locA = entities.Attributes.Select(e => e.A);
                    } else if (landlocation.Equals("B"))
                    {
                        locA = entities.Attributes.Select(e => e.B);
                    } else if (landlocation.Equals("C"))
                    {
                        locA = entities.Attributes.Select(e => e.C);
                    } else if (landlocation.Equals("D"))
                    {
                        locA = entities.Attributes.Select(e => e.D);
                    }
                    
                }
                else if (withoutf.Equals("outside"))
                {
                     inout = entities.Attributes.Select(e => e.withoutf);
                }
                //paved rules
                object pav = entities.Attributes.Select(e => e.paved);
                object strtype = entities.Attributes.Select(e => e.Residential);
                object strnumber = entities.Attributes.Select(e => e.one);
                object vita = entities.Attributes.Select(e => e.proximity);
                object existserv = entities.Attributes.Select(e => e.existenceservices);
                if (pavedstreet.Equals("paved"))
                {
                     pav = entities.Attributes.Select(e => e.paved);
                    if (streetype.Equals("residential"))
                    {
                         strtype = entities.Attributes.Select(e => e.Residential);
                        if (streetnumber.Equals("one"))
                        {
                             strnumber = entities.Attributes.Select(e => e.one);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                     existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                                
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                        } else if (streetnumber.Equals("two"))
                        {
                             strnumber = entities.Attributes.Select(e => e.two);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        } else if (streetnumber.Equals("three"))
                        {
                             strnumber = entities.Attributes.Select(e => e.three);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                             strnumber = entities.Attributes.Select(e => e.four);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                    } else if (streetype.Equals("commerical"))
                    {
                         strtype = entities.Attributes.Select(e => e.commerical);
                        if (streetnumber.Equals("one"))
                        {
                             strnumber = entities.Attributes.Select(e => e.one);
                            if (vitalcenter.Equals("proximity"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                             strnumber = entities.Attributes.Select(e => e.two);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                             strnumber = entities.Attributes.Select(e => e.three);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Select(e => e.four);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                    }
                }
                else if (pavedstreet.Equals("unpaved"))
                {
                     pav = entities.Attributes.Select(e => e.unpaved);
                    if (streetype.Equals("residential"))
                    {
                         strtype = entities.Attributes.Select(e => e.Residential);
                        if (streetnumber.Equals("one"))
                        {
                             strnumber = entities.Attributes.Select(e => e.one);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                             strnumber = entities.Attributes.Select(e => e.two);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                             strnumber = entities.Attributes.Select(e => e.three);
                            if (vitalcenter.Equals("proximity"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                            strnumber = entities.Attributes.Select(e => e.four);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                    }
                    else if (streetype.Equals("commerical"))
                    {
                         strtype = entities.Attributes.Select(e => e.commerical);
                        if (streetnumber.Equals("one"))
                        {
                             strnumber = entities.Attributes.Select(e => e.one);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                        }
                        else if (streetnumber.Equals("two"))
                        {
                             strnumber = entities.Attributes.Select(e => e.two);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                        else if (streetnumber.Equals("three"))
                        {
                             strnumber = entities.Attributes.Select(e => e.three);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                        else if (streetnumber.Equals("four"))
                        {
                             strnumber = entities.Attributes.Select(e => e.four);
                            if (vitalcenter.Equals("proximity"))
                            {
                                 vita = entities.Attributes.Select(e => e.proximity);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }
                            else if (vitalcenter.Equals("far"))
                            {
                                 vita = entities.Attributes.Select(e => e.far);
                                if (services.Equals("lack"))
                                {
                                    existserv = entities.Attributes.Select(e => e.existenceservices);
                                }
                                else
                                {
                                    existserv = entities.Attributes.Select(e => e.lackservices);
                                }
                            }

                        }
                    }
                }
                // parking
                object parking = entities.Attributes.Select(e => e.parkingexist);
                if (park.Equals("exist"))
                {
                     parking = entities.Attributes.Select(e => e.parkingexist);
                }
                else if (park.Equals("not exist"))
                {
                     parking = entities.Attributes.Select(e => e.parkingnotexist);
                }
                // rebound
                object reb = entities.Attributes.Select(e => e.rebounds);
                if (rebound.Equals("not exist"))
              {
                   reb = entities.Attributes.Select(e => e.rebounds);
                }
                else if (rebound.Equals("exist"))
                {
                    reb = entities.Attributes.Select(e => e.reboundsexist);
                }

                // propertycontract
                object proper = entities.Attributes.Select(e => e.sorted);
                if (propertycontract.Equals("sorted"))
                {
                     proper = entities.Attributes.Select(e => e.sorted);
                } else if (propertycontract.Equals("romured"))
                {
                     proper = entities.Attributes.Select(e => e.romured);
                } else if (propertycontract.Equals("financial"))
                {
                     proper = entities.Attributes.Select(e => e.financial);
                }

                // rent
                object old = entities.Attributes.Select(e => e.oldrent);
                object newre = entities.Attributes.Select(e => e.newrent);

                //permit
                object permitbuild = entities.Attributes.Select(e=>e.buildingpermitexist);
                if (permit.Equals("exist")){

                     permitbuild = entities.Attributes.Select(e => e.buildingpermitexist);
                }
                else if(permit.Equals("not exist"))
                {
                    permitbuild = entities.Attributes.Select(e => e.buildingpermitnotexist);
                }

                
              
                    object x = Convert.ToDouble( proper) + Convert.ToDouble(parking) + Convert.ToDouble(pav) + Convert.ToDouble(strnumber) + Convert.ToDouble(strtype) + Convert.ToDouble(vita) + Convert.ToDouble(existserv) + Convert.ToDouble(permitbuild) + Convert.ToDouble(inout) + Convert.ToDouble(locA) + Convert.ToDouble(elv) + Convert.ToDouble(floarloc) + Convert.ToDouble(sl) + Convert.ToDouble(lands) + Convert.ToDouble(qual) + Convert.ToDouble(heal) + Convert.ToDouble(mat) + Convert.ToDouble(reb);
                x = Convert.ToDouble(x) * Convert.ToDouble(pr);
                
                return (IEnumerable<Attributes>)x;
            }
        }

        public Attributes Get(int id)
        {
            using (ExpertSystemEntities entities = new ExpertSystemEntities())
            {
                return entities.Attributes.FirstOrDefault(e => e.ID == id);
            }
        }
    }
}
